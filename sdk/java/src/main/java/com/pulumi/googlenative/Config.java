// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative;

import com.pulumi.core.internal.Codegen;
import java.lang.Boolean;
import java.lang.String;
import java.util.Optional;

public final class Config {

    private static final com.pulumi.Config config = com.pulumi.Config.of("google-native");
/**
 * Additional user-agent string to append to the default one (&lt;prod_name&gt;/&lt;ver&gt;).
 * 
 */
    public Optional<String> appendUserAgent() {
        return Codegen.stringProp("appendUserAgent").config(config).get();
    }
/**
 * This will disable the Pulumi Partner Name which is used if a custom `partnerName` isn&#39;t specified.
 * 
 */
    public Optional<Boolean> disablePartnerName() {
        return Codegen.booleanProp("disablePartnerName").config(config).get();
    }
/**
 * A Google Partner Name to facilitate partner resource usage attribution.
 * 
 */
    public Optional<String> partnerName() {
        return Codegen.stringProp("partnerName").config(config).get();
    }
/**
 * The default project to manage resources in. If another project is specified on a resource, it will take precedence.
 * 
 */
    public Optional<String> project() {
        return Codegen.stringProp("project").config(config).get();
    }
/**
 * The default region to manage resources in. If another region is specified on a regional resource, it will take precedence.
 * 
 */
    public Optional<String> region() {
        return Codegen.stringProp("region").config(config).get();
    }
/**
 * The default zone to manage resources in. Generally, this zone should be within the default region you specified. If another zone is specified on a zonal resource, it will take precedence.
 * 
 */
    public Optional<String> zone() {
        return Codegen.stringProp("zone").config(config).get();
    }
}