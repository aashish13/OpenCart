<%-- 
    Document   : index
    Created on : 7-Dec-2015, 4:02:32 AM
    Author     : esha
--%>

<!DOCTYPE html>
<html>
    <div class="container" style="margin:auto;">
        <!-- Including header -->
        <jsp:include page="header.jsp" />
        
        <div class="container">
  
  <div class="span8">
    
    <h3>Promotions</h3>
    
    <div class="well">
     
    <div id="myCarousel" class="carousel slide">
     
    <ol class="carousel-indicators">
        <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
        <li data-target="#myCarousel" data-slide-to="1"></li>
        <li data-target="#myCarousel" data-slide-to="2"></li>
    </ol>
     
    <!-- Carousel items -->
    <div class="carousel-inner">
        
    <div class="item active">
        <div class="row-fluid">
          <div class="span3"><a href="#x" class="thumbnail"><img src="http://placehold.it/250x250" alt="Image" style="max-width:100%;"></a></div>
         </div><!--/row-fluid-->
    </div><!--/item-->
     
    <div class="item">
        <div class="row-fluid">
            <div class="span3"><a href="#x" class="thumbnail"><img src="http://placehold.it/250x250" alt="Image" style="max-width:100%;"></a></div>
          </div><!--/row-fluid-->
    </div><!--/item-->
     
    <div class="item">
        <div class="row-fluid">
            <div class="span3"><a href="#x" class="thumbnail"><img src="http://placehold.it/250x250" alt="Image" style="max-width:100%;"></a></div>
          </div><!--/row-fluid-->
    </div><!--/item-->
     
    </div><!--/carousel-inner-->
     
    <a class="left carousel-control" href="#myCarousel" data-slide="prev">?</a>
    <a class="right carousel-control" href="#myCarousel" data-slide="next">?</a>
    </div><!--/myCarousel-->
     
    </div><!--/well-->
  </div>
</div>
        
        
    </div>
</body>
</html>