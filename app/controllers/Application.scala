package controllers

import play.api.libs.ws.WS
import play.api.mvc._
import play.api.Play.current
import play.twirl.api.Html
import scala.concurrent.ExecutionContext.Implicits.global

object Application extends Controller {

  def index = Action {
    Ok(views.html.index())
  }

  def githubContributions = Action.async {
    val url = WS.url("https://github.com/users/paullepoulpe/contributions")
    url.get.map(wsResponse => Ok(Html(wsResponse.body)))
  }

}