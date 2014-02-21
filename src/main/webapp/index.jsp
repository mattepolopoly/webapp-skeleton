<!DOCTYPE html>
<html lang="en">
<head>
<link rel="stylesheet" href="http://yui.yahooapis.com/pure/0.4.2/pure-min.css">
</head>
<body>
  <form class="pure-form" action="/servlet">
    <fieldset>
      <legend>A compact inline form</legend>
      <input name="email" type="email" placeholder="Email">
      <input name="password" type="password" placeholder="Password">
      <label for="remember">
        <input name="remember" id="remember" type="checkbox"> Remember me
      </label>
      <button type="submit" class="pure-button pure-button-primary">Sign in</button>
    </fieldset>
  </form>
</html>
