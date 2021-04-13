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

    <!-- TODO customize transformation rules 
         syntax recommendation http://www.w3.org/TR/xslt 
    -->
    <xsl:template match="/">
        <html>
            <head>                
                <title>style.xsl</title>
            </head>                   
            <body>
                <xsl:for-each select="colors/color">                    
                    <H1>                        
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
                        Hello, world!
                    </H1>              
                </xsl:for-each>
            </body>
        </html>
    </xsl:template>
</xsl:stylesheet>