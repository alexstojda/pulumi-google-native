// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.metastore.v1alpha.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.googlenative.metastore.v1alpha.outputs.SecretResponse;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class KerberosConfigResponse {
    /**
     * @return A Kerberos keytab file that can be used to authenticate a service principal with a Kerberos Key Distribution Center (KDC).
     * 
     */
    private SecretResponse keytab;
    /**
     * @return A Cloud Storage URI that specifies the path to a krb5.conf file. It is of the form gs://{bucket_name}/path/to/krb5.conf, although the file does not need to be named krb5.conf explicitly.
     * 
     */
    private String krb5ConfigGcsUri;
    /**
     * @return A Kerberos principal that exists in the both the keytab the KDC to authenticate as. A typical principal is of the form primary/instance@REALM, but there is no exact format.
     * 
     */
    private String principal;

    private KerberosConfigResponse() {}
    /**
     * @return A Kerberos keytab file that can be used to authenticate a service principal with a Kerberos Key Distribution Center (KDC).
     * 
     */
    public SecretResponse keytab() {
        return this.keytab;
    }
    /**
     * @return A Cloud Storage URI that specifies the path to a krb5.conf file. It is of the form gs://{bucket_name}/path/to/krb5.conf, although the file does not need to be named krb5.conf explicitly.
     * 
     */
    public String krb5ConfigGcsUri() {
        return this.krb5ConfigGcsUri;
    }
    /**
     * @return A Kerberos principal that exists in the both the keytab the KDC to authenticate as. A typical principal is of the form primary/instance@REALM, but there is no exact format.
     * 
     */
    public String principal() {
        return this.principal;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(KerberosConfigResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private SecretResponse keytab;
        private String krb5ConfigGcsUri;
        private String principal;
        public Builder() {}
        public Builder(KerberosConfigResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.keytab = defaults.keytab;
    	      this.krb5ConfigGcsUri = defaults.krb5ConfigGcsUri;
    	      this.principal = defaults.principal;
        }

        @CustomType.Setter
        public Builder keytab(SecretResponse keytab) {
            this.keytab = Objects.requireNonNull(keytab);
            return this;
        }
        @CustomType.Setter
        public Builder krb5ConfigGcsUri(String krb5ConfigGcsUri) {
            this.krb5ConfigGcsUri = Objects.requireNonNull(krb5ConfigGcsUri);
            return this;
        }
        @CustomType.Setter
        public Builder principal(String principal) {
            this.principal = Objects.requireNonNull(principal);
            return this;
        }
        public KerberosConfigResponse build() {
            final var o = new KerberosConfigResponse();
            o.keytab = keytab;
            o.krb5ConfigGcsUri = krb5ConfigGcsUri;
            o.principal = principal;
            return o;
        }
    }
}