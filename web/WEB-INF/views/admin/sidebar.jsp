<%-- 
    Document   : sidebar
    Created on : Dec 4, 2015, 8:53:35 PM
    Author     : Aashish
--%>

<div class="col-lg-3">
    <div class="widget widget-list well">
        <ul id="filters" class="nav nav-list clearfix">
            <li>
                <a href="/OpenCart/admin/appconf?action=viewall" data-filter="*" class="selected">
                <i class="icon-refresh"></i> App Config</a>
            </li>
            <li>
                <a href="/OpenCart/admin/address?action=viewall" data-filter="">
                    <i class="icon-check"></i> Address
                </a>
            </li>
            <li><a href="/OpenCart/admin/category?action=viewall" data-filter=""><i class="icon-check"></i> Category</a></li>
            <li><a href="/OpenCart/admin/subcategory?action=viewall" data-filter=""><i class="icon-check"></i>Sub Category</a></li>
            <li><a href="/OpenCart/admin/categories?action=viewall" data-filter=""><i class="icon-check"></i> Order</a></li>
            <li><a href="/OpenCart/admin/products?action=viewall" data-filter=""><i class="icon-check"></i> Product</a></li>
        </ul>
    </div>
</div>