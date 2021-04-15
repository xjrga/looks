<?xml version="1.0" encoding="UTF-8"?>

<!--
    Document   : style.xsl
    Created on : April 13, 2021, 12:20 PM
    Author     : jr
    Description:
	Purpose of transformation follows.
-->

<xsl:stylesheet xmlns:xsl="http://www.w3.org/1999/XSL/Transform" version="1.0">
    <xsl:output method="html"/>
    <xsl:strip-space elements="*"/>
    <!-- TODO customize transformation rules 
	 syntax recommendation http://www.w3.org/TR/xslt 
    -->
    <xsl:template match="/">
	<html>
	    <head>                
		<!--link href="style.css" rel="stylesheet" type="text/css"/-->
		<title>style.xsl</title>
		<style>
		    html {        
		    background-color:rgb(0, 0, 0);    
		    }
		    div {
		    text-align: center;
		    max-width: 500px;
		    margin: auto;																
		    padding: 10px;
		    border: 1px solid white;
		    }
		    #name {
		    border: 1px solid black;
		    word-wrap: break-word;						
		    }
		    #margin {
		    margin: 10px;
		    }		
		</style>
	    </head>                   
	    <body>
		<div>
		<xsl:for-each select="palette/color">		   
		    <div>
			<xsl:attribute name="id">
			    <xsl:text>margin</xsl:text>
			</xsl:attribute>
			<xsl:attribute name="style">
			    <xsl:text>background-color:rgb(</xsl:text>
			    <xsl:text>
				<xsl:value-of select="red"/>
			    </xsl:text>
			    <xsl:text>,</xsl:text>
			    <xsl:text>
				<xsl:value-of select="green"/>
			    </xsl:text>
			    <xsl:text>,</xsl:text>
			    <xsl:text>
				<xsl:value-of select="blue"/>
			    </xsl:text>
			    <xsl:text>);</xsl:text>
			</xsl:attribute>
			<xsl:value-of select="hexcode"/>
		    </div>		    
		</xsl:for-each> 
		<xsl:for-each select="palette">		    
		    <div>
			<xsl:attribute name="id">
			    <xsl:text>name</xsl:text>
			</xsl:attribute>
			Palette: <xsl:value-of select="name"/>
		    </div>
		</xsl:for-each>
		</div>
	    </body>
	</html>
    </xsl:template>
</xsl:stylesheet>
