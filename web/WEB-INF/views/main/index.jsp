<%-- 
    Document   : index
    Created on : Dec 1, 2015, 6:27:55 PM
    Author     : Aashish
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        
         <meta charset="utf-8">
    <title>Main</title>
	<meta name="author" content="ZERGE">
	<meta name="keywords" content="responsive html template, portfolio, creative, design, clean, minimal, light, dark, twitter, bootstrap">
	<meta name="description" content="Responsive HTML Template - Gallery">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">

    <!-- Styles -->
    <meta content="text/html; charset=utf-8" http-equiv="Content-Type">
    <link href="css/bootstrap.css" rel="stylesheet">
    <link href="css/bootstrap-responsive.css" rel="stylesheet">
    <link href="css/prettyPhoto.css" rel="stylesheet">
    <link href="css/flexslider.css" rel="stylesheet">

    <link href="css/style.css" rel="stylesheet">
    
    <!-- HTML5 shim, for IE6-8 support of HTML5 elements -->
    <!--[if lt IE 9]>
      <script src="http://html5shim.googlecode.com/svn/trunk/html5.js"></script>
    <![endif]-->

    <!-- Fav and touch icons -->
    <link rel="shortcut icon" href="img/ico/favicon.ico">
    <link rel="apple-touch-icon-precomposed" sizes="144x144" href="img/ico/apple-touch-icon-144-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="114x114" href="img/ico/apple-touch-icon-114-precomposed.png">
    <link rel="apple-touch-icon-precomposed" sizes="72x72" href="img/ico/apple-touch-icon-72-precomposed.png">
    <link rel="apple-touch-icon-precomposed" href="img/ico/apple-touch-icon-57-precomposed.png">

    </head>
    <body>
        <div class="container">

  <!-- Masthead
  ================================================== -->
  <header>
    
    <!-- Top Panel
    ================================================== -->
    <div id="top-panel">
      <div class="login-box">
        <form>
		  <div class="input-prepend">
            <span class="add-on"><i class="icon-user"></i></span><input class="span2" id="username" type="text" name="username" placeholder="User Name">
          </div>
		  <div class="input-prepend">
            <span class="add-on"><i class="icon-lock"></i></span><input class="span2" id="userpassword" type="password" name="userpassword" placeholder="Password">
          </div>
          <label class="checkbox">
    		<input type="checkbox"> Remember me
  		  </label>
          <button type="submit" class="btn">Sign in</button>
        </form>
      </div><!-- login-box -->
      <div class="login-button toggle">
        <a href="#">Sign in</a>
      </div><!-- login-button -->
    </div><!-- top-panel -->

   

<!-- Navbar
    ================================================== -->
    <div class="row">
      <div class="span3 logo">
        <a href="index.html"><img src="img/logo.png" alt="" /></a>
      </div><!-- logo -->
      <div class="span9 navigation">
        <div id="menu" class="fix-fish-menu clearfix">
          <ul id="nav" class="sf-menu">
            <li><a href="index.html">Home</a>
              <ul>
                <li><a href="index-flex.html">Home + Flex Slider</a></li>
              </ul>
            </li>
            <li><a href="blog.html">Blog</a>
              <ul>
                <li><a href="blog.html">Blog</a></li>
                <li><a href="blog-post.html">Blog Post + Image</a></li>
                <li><a href="blog-post-video.html">Blog Post + Video</a></li>                
              </ul>
            </li>
			<li class="active"> <a href="#">Portfolio</a>
			  <ul>
				<li><a href="#">3 Columns <span class="sf-sub-indicator"></span></a>
				  <ul>
				    <li><a href="portfolio-3.html">3 Columns + Horizontal</a></li>
				    <li><a href="portfolio-vertical-3.html">3 Columns + Vertical</a></li>
				    <li><a href="portfolio-description-3.html">3 Columns + Description</a></li>
				    <li><a href="portfolio-big-3.html">3 Big Columns</a></li>
				  </ul>
				</li>
				<li><a href="#">4 Columns <span class="sf-sub-indicator"></span></a>
				  <ul>
					<li><a href="portfolio-4.html">4 Columns + Horizontal</a></li>
				    <li><a href="portfolio-description-4.html">4 Columns + Description</a></li>
					<li><a href="portfolio-vertical-4.html">4 Columns + Vertical</a></li>
				  </ul>
				</li>
				<li><a href="#">Portfolio Item <span class="sf-sub-indicator"></span></a>
				  <ul>
				  	<li><a href="item.html">Standard</a></li>
					<li><a href="item-slideshow.html">Slideshow</a></li>
                                        <li><a href="item-video.html">Video</a></li>
				  </ul>
				</li>
				<li><a href="gallery.html">Gallery</a></li>
			  </ul>
			</li>
			<li> <a href="typography.html">Typography</a></li>
			<li> <a href="shortcodes.html">Shortcodes</a></li>
			<li> <a href="#">Pages</a>
			  <ul>
			    <li><a href="left-content.html">Left + Content</a></li>
				<li><a href="content-right.html">Content + Right</a></li>
				<li><a href="full-width.html">Full Width Page</a></li>
				<li><a href="#">Submenu <span class="sf-sub-indicator"></span></a>
			      <ul>
					<li><a href="#">Item #1</a></li>
					<li><a href="#">Item #2</a></li>
				  </ul>
				</li>
			  </ul>
			</li>
		 	<li><a href="contacts.html">Contacts</a></li>
            <li><a href="http://themeforest.net/item/claystone-responsive-html-template/2746744?ref=zerge"><i class="icon-shopping-cart icon-white"></i>Purchase</a></li>
          </ul><!-- end #nav  -->
        </div><!-- end #menu  -->
      </div><!-- navigation -->
    </div><!-- row -->
    
    <div class="row">
      <div class="span3"><div class="border-5-1"></div></div>
      <div class="span9"><div class="border-5-1 hide-border"></div></div>
    </div><!-- row -->

    <div class="row">
      <div class="span3 clearfix">
        <ul class="social-icons">
	      <li class="pinterest" ><a href="http://pinterest.com/zergev/"></a></li>      
          <li class="twitter"><a href="http://twitter.com"></a></li>
	      <li class="dribbble"><a href="http://dribbble.com"></a></li>
	      <li class="facebook"><a href="http://facebook.com"></a></li>
	      <li class="google"><a href="http://plus.google.com"></a></li>
	      <li class="linkedin"><a href="http://linkedin.com"></a></li>
	      <li class="behance"><a href="http://behance.net"></a></li>
              <li class="rss"><a href="#"></a></li>
	    </ul>
      </div><!-- span3 -->
      <div class="span9">
        <div class="separator">
 		  <h3>Just Simple Gallery</h3>
        </div><!-- separator -->
        <span></span>
      </div><!-- span9 -->
    </div><!-- row -->


    <div class="row">
      <div class="span3"><div class="border-1-5"></div></div>
      <div class="span9"><div class="border-1-5 hide-border"></div></div>
    </div><!-- row -->

  </header>    



  <!-- Potfolio Item
  ================================================== -->
    <div id="entry-portfolio-item" class="row gallery-page">
	  <div class="span3">
	    <div class="widget well clearfix">
	      <h3>Just Simple Gallery</h3>
	      <dl>
        	<dt>Some Description</dt>
        	<dd>Sed ut perspiciatis unde omnis iste natus error sit voluptatem accusantium doloremque laudantium, totam rem aperiam, eaque ipsa quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt explicabo.</dd>
      	  </dl>
      	  <dl>
        	<dt>Another Description</dt>
        	<dd>At vero eos et accusamus et iusto odio dignissimos ducimus qui blanditiis praesentium voluptatum deleniti atque corrupti quos dolores et quas molestias excepturi.</dd>
      	  </dl>
      	  
      	  <!-- Example accordion -->
		  <div class="accordion last" id="accordion2">
            <div class="accordion-group">
              <div class="accordion-heading">
                <a class="accordion-toggle" data-toggle="collapse" data-parent="#accordion2" href="#collapseOne">
                  Collapsible Group Item #1
                </a>
              </div>
<div id="collapseOne" class="accordion-body collapse" style="height: 0px; ">
                <div class="accordion-inner">
                  Anim pariatur cliche reprehenderit, enim eiusmod high life accusamus terry richardson ad squid. 3 wolf moon officia aute, non cupidatat skateboard dolor brunch. Food truck quinoa nesciunt laborum eiusmod.
                </div>
              </div>
            </div>
            <div class="accordion-group">
              <div class="accordion-heading">
                <a class="accordion-toggle" data-toggle="collapse" data-parent="#accordion2" href="#collapseTwo">
                  Collapsible Group Item #2
                </a>
              </div>
              <div id="collapseTwo" class="accordion-body collapse" style="height: 0px; ">
                <div class="accordion-inner">
                  Leggings occaecat craft beer farm-to-table, raw denim aesthetic synth nesciunt you probably haven't heard of them accusamus labore sustainable VHS.
                </div>
              </div>
            </div>
            <div class="accordion-group">
              <div class="accordion-heading">
                <a class="accordion-toggle" data-toggle="collapse" data-parent="#accordion2" href="#collapseThree">
                  Collapsible Group Item #3
                </a>
              </div>
              <div id="collapseThree" class="accordion-body in collapse" style="height: auto; ">
                <div class="accordion-inner">
                  3 wolf moon officia aute, non cupidatat skateboard dolor brunch. Food truck quinoa nesciunt laborum eiusmod. 
                </div>
              </div>
            </div>
          </div>
          <!-- End accordion -->
	    </div><!-- widget widget-list well -->
	  </div><!-- span3 -->
	  
	  <div class="span9">
	    <div id="container-item" class="row">
	      <div class="span9">
		    <div class="thumb view">
			  <div class="gallery-slider flexslider clearfix">
        		<ul class="slides">
          		  <li class="view">
            		<img src="img/projects/img01.jpg" alt="" />
          		  </li>
          		  <li>
<img src="img/projects/img03.jpg" alt="" />
          		  </li>
          		  <li>
            		<img src="img/projects/img05.jpg" alt="" />
          		  </li>
          		  <li>
            		<img src="img/projects/img08.jpg" alt="" />
          		  </li>
          		  <li>
            		<img src="img/projects/img07.jpg" alt="" />
          		  </li>
        		</ul>
      		  </div><!-- item-slider -->
			</div><!-- thumb -->  
			<div class="gallery-carousel flexslider">
			  <ul class="slides">
         	    <li>
            	  <img src="img/projects/img01.jpg" alt="" />
          		</li>
          		<li>
            	  <img src="img/projects/img03.jpg" alt="" />
          		</li>
          	    <li>
            	  <img src="img/projects/img05.jpg" alt="" />
          		</li>
          		<li>
            	  <img src="img/projects/img08.jpg" alt="" />
          		</li>
          		<li>
            	  <img src="img/projects/img07.jpg" alt="" />
          		</li>
			  </ul>
			</div><!-- item-carousel -->
		  </div><!-- span9 -->
        </div><!-- row -->
	  </div><!-- span9 -->
	</div><!-- row entry-portfolio -->
	
	    <!-- DIVIDER -->
      	<div class="row margin10-40">
      	  <div class="span3"><div class="border-5-1"></div></div>
      	  <div class="span9"><div class="border-5-1 hide-border"></div></div>
    	</div><!-- row -->	
	<!-- ============================================================================================= -->

        
        <!-- Footer
================================================== -->
  <footer class="footer row">
    <div class="span3">
      <div class="logo-footer widget">
        <h5>Contact Info</h5>
		<ul id="contact-info" class="clearfix">
		  <li><i class="icon-map-marker icon-white"></i><address>12345 / Some Street, Portland, USA</address></li>
		  <li><i class="icon-user icon-white"></i>phone: +1 (44)  123-45-67</li>
		  <li><i class="icon-headphones icon-white"></i><a href="skype:echo123?call">Skype Me</a></li>
		  <li><i class="icon-envelope icon-white"></i><a href="mailto:support@color-theme.com">support@color-theme.com</a></li>
		</ul>
      </div><!-- logo-footer -->
    </div><!-- span3 -->
    
    <div class="span9 footer-widgets clearfix">
	  <div class="widget">
	    <h5>Popular Posts</h5>
		<ul class="popular-posts">
		  <li>
		    <a href="#"><img src="img/blog/widgets/img01-40x40.jpg" alt="" /></a>
		    <a href="#">Domino Theory</a>
		    <span class="date">June 24, 2012</span>
		  </li>
		  <li>
		    <a href="#"><img src="img/blog/widgets/img02-40x40.jpg" alt="" /></a>
		    <a href="#">Crossing Paths</a>
		    <span class="date">June 22, 2012</span>
		  </li>
		  <li>
		    <a href="#"><img src="img/blog/widgets/img03-40x40.jpg" alt="" /></a>
		    <a href="#">Corporate Equality Index</a>
		    <span class="date">May 09, 2012</span>
		  </li>
		</ul>
	  </div><!-- .widget -->

	  <div class="widget">
	    <h5>Latest Posts</h5>
		<ul class="latest-posts">
		  <li>
		    <a href="#"><img src="img/blog/widgets/img04-40x40.jpg" alt="" /></a>
		    <a href="#">The Peace Corps</a>
    <span class="date">Jule 02, 2012</span>		  
		  </li>
		  <li>
		    <a href="#"><img src="img/blog/widgets/img01-40x40.jpg" alt="" /></a>
		    <a href="#">Domino Theory</a>
		    <span class="date">June 24, 2012</span>
		  </li>
		  <li>
		    <a href="#"><img src="img/blog/widgets/img05-40x40.jpg" alt="" /></a>
		    <a href="#">Flickr Eggs</a>
		    <span class="date">May 14, 2012</span>
		  </li>
		</ul>
	  </div><!-- .widget -->

	  <div class="widget">
	    <h5>Flickr Photos</h5>
	    <ul class="flickr thumbs"></ul>
	  </div><!-- .widget -->
	  
    </div><!-- footer-widgets -->
  </footer>

  <div id="bottom-panel" class="clearfix">
  <span class="site-name">Claystone — Responsive HTML Template</span>
  <span>Copyright &copy; 2012. Designed by <a href="http://themeforest.net/user/ZERGE?ref=zerge">ZERGE</a> for <a href="http://themeforest.net/user/ZERGE/portfolio?ref=zerge">Themeforest</a>.</span></div>
  
  </div><!-- /container -->
  
  <!-- Javascripts
    ================================================== -->
    <!-- Placed at the end of the document so the pages load faster -->
    <script src="http://ajax.googleapis.com/ajax/libs/jquery/1.7.2/jquery.min.js"></script>
	<script src="js/jquery.easing.1.3.js"></script>
	<script src="js/superfish.js"></script>    
    <script src="js/bootstrap.min.js"></script>
	<script src="js/jflickrfeed.min.js"></script>
	<script src="js/jquery.flexslider-min.js"></script>
	<script src="js/jquery.fitvid.js"></script>
	<script src="js/jquery.prettyPhoto.js"></script>
	<script src="js/jquery.preloader.js"></script>

    <!-- Support CSS3 Media Queries for IE 6-8 -->
	<script src="js/respond.min.js"></script>

	<script>
	  jQuery.noConflict()(function($){
		  $('.gallery-carousel').flexslider({
		      animation: "slide",
  		      controlNav: false,
		      animationLoop: false,
		      slideshow: false,
		      itemWidth: 220,
		      itemMargin: 5,
		      touch: true,
		      asNavFor: '.gallery-slider'
  			});
   
  		$('.gallery-slider').flexslider({
    		animation: "slide",
    		controlNav: false,
    		animationLoop: false,
    		slideshow: false,
    		touch: true,
   			sync: ".gallery-carousel"
  		});
	  });
	</script>
<script src="js/custom.js"></script>	


	<!-- For Images Preloading -->
	<script type="text/javascript">var runFancy = true;</script>

    <!--[if IE]>
    <script type="text/javascript">
      runFancy = false;
    </script>
    <![endif]-->
    
    <script type="text/javascript">
      if (runFancy) {
        jQuery.noConflict()(function($){
          $(".view").preloader();
          });
        };
	</script>
	
<!-- Google Analytics
================================================== -->

<script type="text/javascript">
  var _gaq = _gaq || [];
  _gaq.push(['_setAccount', 'UA-32822583-1']);
  _gaq.push(['_setDomainName', 'color-theme.com']);
  _gaq.push(['_trackPageview']);
  (function() {
    var ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true;
    ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';
    var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(ga, s);
  })();
</script>
	
  </body>
</html>



