<!DOCTYPE html>
<html>
    <head>
        <title>Smart Compare</title>

        <link href="https://fonts.googleapis.com/css?family=Lato:100" rel="stylesheet" type="text/css">
        <script src="<%=request.getContextPath()%>/js/jquery-1.11.3.min.js"></script>
        <script src="<%=request.getContextPath()%>/js/bootstrap.min.js"></script>
        <link href="<%=request.getContextPath()%>/style/bootstrap.min.css" rel="stylesheet" >
        <link href="<%=request.getContextPath()%>/style/main.css" rel="stylesheet" >
    </head>
    <body>
        <div class="container" style="margin:auto;">
<header>
  <nav class="navbar navbar-default">
      <a class="navbar-brand" href="index.html">Open Cart</a>
      <div class="navbar-header">
        <ul class="nav navbar-nav">
          <li > <a href="\">Home</a> </li>
        </ul>
      </div>
      <p class="navbar-text navbar-right"><a href="login.html">Sign in</a></p>
  </nav>
</header>
<div class="row clearfix">
  <div class="col-lg-3">
    <div class="widget widget-list well">
        <ul id="filters" class="nav nav-list clearfix">
        <li><a href="#" data-filter="*" class="selected"><i class="icon-refresh"></i> All</a></li>
        <li><a href="#" data-filter=".SmartPhone"><i class="icon-check"></i> Smart Phone</a></li>
        <li><a href="#" data-filter=".iphone"><i class="icon-check"></i> Iphone</a></li>
        <li><a href="#" data-filter=".apple"><i class="icon-check"></i> Apple</a></li>
        <li><a href="#" data-filter=".samsung"><i class="icon-check"></i> Samsung</a></li>
        </ul>
    </div
  </div>
  <div class="col-lg-9">
  <div  class="row">
        <a href='product-details?id='>
            <div class="item-box iphone">
            <img src="" />
              <p class="text-center"><a href='product-details?id='></a></p>
            </div>
        </a>
  </div>
  </div>
</div>
</div>
</body>
</html>