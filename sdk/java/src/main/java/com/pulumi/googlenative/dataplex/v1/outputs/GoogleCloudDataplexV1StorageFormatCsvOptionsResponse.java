// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.dataplex.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleCloudDataplexV1StorageFormatCsvOptionsResponse {
    /**
     * @return Optional. The delimiter used to separate values. Defaults to &#39;,&#39;.
     * 
     */
    private String delimiter;
    /**
     * @return Optional. The character encoding of the data. Accepts &#34;US-ASCII&#34;, &#34;UTF-8&#34;, and &#34;ISO-8859-1&#34;. Defaults to UTF-8 if unspecified.
     * 
     */
    private String encoding;
    /**
     * @return Optional. The number of rows to interpret as header rows that should be skipped when reading data rows. Defaults to 0.
     * 
     */
    private Integer headerRows;
    /**
     * @return Optional. The character used to quote column values. Accepts &#39;&#34;&#39; (double quotation mark) or &#39;&#39;&#39; (single quotation mark). Defaults to &#39;&#34;&#39; (double quotation mark) if unspecified.
     * 
     */
    private String quote;

    private GoogleCloudDataplexV1StorageFormatCsvOptionsResponse() {}
    /**
     * @return Optional. The delimiter used to separate values. Defaults to &#39;,&#39;.
     * 
     */
    public String delimiter() {
        return this.delimiter;
    }
    /**
     * @return Optional. The character encoding of the data. Accepts &#34;US-ASCII&#34;, &#34;UTF-8&#34;, and &#34;ISO-8859-1&#34;. Defaults to UTF-8 if unspecified.
     * 
     */
    public String encoding() {
        return this.encoding;
    }
    /**
     * @return Optional. The number of rows to interpret as header rows that should be skipped when reading data rows. Defaults to 0.
     * 
     */
    public Integer headerRows() {
        return this.headerRows;
    }
    /**
     * @return Optional. The character used to quote column values. Accepts &#39;&#34;&#39; (double quotation mark) or &#39;&#39;&#39; (single quotation mark). Defaults to &#39;&#34;&#39; (double quotation mark) if unspecified.
     * 
     */
    public String quote() {
        return this.quote;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleCloudDataplexV1StorageFormatCsvOptionsResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String delimiter;
        private String encoding;
        private Integer headerRows;
        private String quote;
        public Builder() {}
        public Builder(GoogleCloudDataplexV1StorageFormatCsvOptionsResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.delimiter = defaults.delimiter;
    	      this.encoding = defaults.encoding;
    	      this.headerRows = defaults.headerRows;
    	      this.quote = defaults.quote;
        }

        @CustomType.Setter
        public Builder delimiter(String delimiter) {
            this.delimiter = Objects.requireNonNull(delimiter);
            return this;
        }
        @CustomType.Setter
        public Builder encoding(String encoding) {
            this.encoding = Objects.requireNonNull(encoding);
            return this;
        }
        @CustomType.Setter
        public Builder headerRows(Integer headerRows) {
            this.headerRows = Objects.requireNonNull(headerRows);
            return this;
        }
        @CustomType.Setter
        public Builder quote(String quote) {
            this.quote = Objects.requireNonNull(quote);
            return this;
        }
        public GoogleCloudDataplexV1StorageFormatCsvOptionsResponse build() {
            final var o = new GoogleCloudDataplexV1StorageFormatCsvOptionsResponse();
            o.delimiter = delimiter;
            o.encoding = encoding;
            o.headerRows = headerRows;
            o.quote = quote;
            return o;
        }
    }
}