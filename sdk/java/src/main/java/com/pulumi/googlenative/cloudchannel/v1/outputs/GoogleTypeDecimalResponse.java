// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.cloudchannel.v1.outputs;

import com.pulumi.core.annotations.CustomType;
import java.lang.String;
import java.util.Objects;

@CustomType
public final class GoogleTypeDecimalResponse {
    /**
     * @return The decimal value, as a string. The string representation consists of an optional sign, `+` (`U+002B`) or `-` (`U+002D`), followed by a sequence of zero or more decimal digits (&#34;the integer&#34;), optionally followed by a fraction, optionally followed by an exponent. The fraction consists of a decimal point followed by zero or more decimal digits. The string must contain at least one digit in either the integer or the fraction. The number formed by the sign, the integer and the fraction is referred to as the significand. The exponent consists of the character `e` (`U+0065`) or `E` (`U+0045`) followed by one or more decimal digits. Services **should** normalize decimal values before storing them by: - Removing an explicitly-provided `+` sign (`+2.5` -&gt; `2.5`). - Replacing a zero-length integer value with `0` (`.5` -&gt; `0.5`). - Coercing the exponent character to lower-case (`2.5E8` -&gt; `2.5e8`). - Removing an explicitly-provided zero exponent (`2.5e0` -&gt; `2.5`). Services **may** perform additional normalization based on its own needs and the internal decimal implementation selected, such as shifting the decimal point and exponent value together (example: `2.5e-1` &lt;-&gt; `0.25`). Additionally, services **may** preserve trailing zeroes in the fraction to indicate increased precision, but are not required to do so. Note that only the `.` character is supported to divide the integer and the fraction; `,` **should not** be supported regardless of locale. Additionally, thousand separators **should not** be supported. If a service does support them, values **must** be normalized. The ENBF grammar is: DecimalString = [Sign] Significand [Exponent]; Sign = &#39;+&#39; | &#39;-&#39;; Significand = Digits &#39;.&#39; | [Digits] &#39;.&#39; Digits; Exponent = (&#39;e&#39; | &#39;E&#39;) [Sign] Digits; Digits = { &#39;0&#39; | &#39;1&#39; | &#39;2&#39; | &#39;3&#39; | &#39;4&#39; | &#39;5&#39; | &#39;6&#39; | &#39;7&#39; | &#39;8&#39; | &#39;9&#39; }; Services **should** clearly document the range of supported values, the maximum supported precision (total number of digits), and, if applicable, the scale (number of digits after the decimal point), as well as how it behaves when receiving out-of-bounds values. Services **may** choose to accept values passed as input even when the value has a higher precision or scale than the service supports, and **should** round the value to fit the supported scale. Alternatively, the service **may** error with `400 Bad Request` (`INVALID_ARGUMENT` in gRPC) if precision would be lost. Services **should** error with `400 Bad Request` (`INVALID_ARGUMENT` in gRPC) if the service receives a value outside of the supported range.
     * 
     */
    private String value;

    private GoogleTypeDecimalResponse() {}
    /**
     * @return The decimal value, as a string. The string representation consists of an optional sign, `+` (`U+002B`) or `-` (`U+002D`), followed by a sequence of zero or more decimal digits (&#34;the integer&#34;), optionally followed by a fraction, optionally followed by an exponent. The fraction consists of a decimal point followed by zero or more decimal digits. The string must contain at least one digit in either the integer or the fraction. The number formed by the sign, the integer and the fraction is referred to as the significand. The exponent consists of the character `e` (`U+0065`) or `E` (`U+0045`) followed by one or more decimal digits. Services **should** normalize decimal values before storing them by: - Removing an explicitly-provided `+` sign (`+2.5` -&gt; `2.5`). - Replacing a zero-length integer value with `0` (`.5` -&gt; `0.5`). - Coercing the exponent character to lower-case (`2.5E8` -&gt; `2.5e8`). - Removing an explicitly-provided zero exponent (`2.5e0` -&gt; `2.5`). Services **may** perform additional normalization based on its own needs and the internal decimal implementation selected, such as shifting the decimal point and exponent value together (example: `2.5e-1` &lt;-&gt; `0.25`). Additionally, services **may** preserve trailing zeroes in the fraction to indicate increased precision, but are not required to do so. Note that only the `.` character is supported to divide the integer and the fraction; `,` **should not** be supported regardless of locale. Additionally, thousand separators **should not** be supported. If a service does support them, values **must** be normalized. The ENBF grammar is: DecimalString = [Sign] Significand [Exponent]; Sign = &#39;+&#39; | &#39;-&#39;; Significand = Digits &#39;.&#39; | [Digits] &#39;.&#39; Digits; Exponent = (&#39;e&#39; | &#39;E&#39;) [Sign] Digits; Digits = { &#39;0&#39; | &#39;1&#39; | &#39;2&#39; | &#39;3&#39; | &#39;4&#39; | &#39;5&#39; | &#39;6&#39; | &#39;7&#39; | &#39;8&#39; | &#39;9&#39; }; Services **should** clearly document the range of supported values, the maximum supported precision (total number of digits), and, if applicable, the scale (number of digits after the decimal point), as well as how it behaves when receiving out-of-bounds values. Services **may** choose to accept values passed as input even when the value has a higher precision or scale than the service supports, and **should** round the value to fit the supported scale. Alternatively, the service **may** error with `400 Bad Request` (`INVALID_ARGUMENT` in gRPC) if precision would be lost. Services **should** error with `400 Bad Request` (`INVALID_ARGUMENT` in gRPC) if the service receives a value outside of the supported range.
     * 
     */
    public String value() {
        return this.value;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GoogleTypeDecimalResponse defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private String value;
        public Builder() {}
        public Builder(GoogleTypeDecimalResponse defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.value = defaults.value;
        }

        @CustomType.Setter
        public Builder value(String value) {
            this.value = Objects.requireNonNull(value);
            return this;
        }
        public GoogleTypeDecimalResponse build() {
            final var o = new GoogleTypeDecimalResponse();
            o.value = value;
            return o;
        }
    }
}