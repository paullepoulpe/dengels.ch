(($) ->
  $.ajax
    url: "github/contributions"
    dataType: "html"
    error: (jqXHR, textStatus, errorThrown) ->
      $('#github-contributions').html("<p>Cannot load contributions: #{textStatus}</p>")
    success: (data, textStatus, jqXHR) ->
      $('#github-contributions').html(data)
      $('#github-contributions svg').addClass("z-depth-1")
) jQuery