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
                    body {        
                    border: 1px solid gray;
                    margin: 100px;
                    }
                    h1 {  
                    text-align: center;
                    }
                    h2 {    
                    text-align: center;
                    margin: auto;
                    margin-top: 10px;
                    margin-bottom: 10px;
                    border:1px solid gray;
                    max-width: 200px;    
                    }
                </style>
            </head>                   
            <body>
                <xsl:for-each select="palette/color">                                        
                    <h2>                        
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
                    </h2>                                      
                </xsl:for-each>
                <xsl:for-each select="palette">
                    <h1>
                        Palette: <xsl:value-of select="name"/>
                    </h1>                    
                </xsl:for-each>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>
