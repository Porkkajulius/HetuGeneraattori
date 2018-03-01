<!doctype html>
<html lang="en">
  <head>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

	<!--Angular -->
	 <script src="https://ajax.googleapis.com/ajax/libs/angularjs/1.5.6/angular.min.js"></script>
    <!-- Bootstrap CSS -->
      <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
	  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
	  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
     <!--  <link rel="stylesheet" href="../css/global.css"  type="text/css" > -->
    <title>Hetulaskuri</title>
  </head>
  <body>
  
<div class="container-fluid">
<div class="row">
  <div class="col-md-4 col-sm-4 col-xs-12"></div>
   <div class="col-md-4 col-sm-5 col-xs-12">
  <form class="form-container" name="LopullinenHetu" action="laske" method="POST">
  <h1>Generoi henkilötunnus</h1>
  <div class="form-group">
    <label for="exampleInputEmail1">Syntymäpäivä DD</label>
    <input class="form-control" name="paiva" placeholder="päivämäärä esim (06)">
  </div>
  
   <div class="form-group">
    <label for="exampleInputEmail1">Syntymäkuukausi MM</label>
    <input class="form-control" name="kuukausi" placeholder="kuukausi esim (08)">
  </div>
  
   <div class="form-group">
    <label for="exampleInputEmail1">Syntymävuosi kaksi viimeistä numeroa YY</label>
    <input class="form-control" name="vuosi" placeholder="syntymävuoden kaksi viimeistä esim (94)">
  </div>

	<button input type="submit" class="btn btn-success btn-block">Submit</button>
	
	<#if LopullinenHetu??>
	
   <tr>
    <td>Laskettu hetu: ${LopullinenHetu}</td>
   </tr>
  
  </#if>

</form>
  </div>
</div>
</div>
    
    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js" integrity="sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js" integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q" crossorigin="anonymous"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl" crossorigin="anonymous"></script>
  </body>
</html>