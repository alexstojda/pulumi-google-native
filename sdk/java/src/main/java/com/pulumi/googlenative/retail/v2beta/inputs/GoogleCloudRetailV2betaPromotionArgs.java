// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.retail.v2beta.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Promotion specification.
 * 
 */
public final class GoogleCloudRetailV2betaPromotionArgs extends com.pulumi.resources.ResourceArgs {

    public static final GoogleCloudRetailV2betaPromotionArgs Empty = new GoogleCloudRetailV2betaPromotionArgs();

    /**
     * Promotion identifier, which is the final component of name. For example, this field is &#34;free_gift&#34;, if name is `projects/*{@literal /}locations/global/catalogs/default_catalog/promotions/free_gift`. The value must be a UTF-8 encoded string with a length limit of 128 characters, and match the pattern: `a-zA-Z*`. For example, id0LikeThis or ID_1_LIKE_THIS. Otherwise, an INVALID_ARGUMENT error is returned. Corresponds to Google Merchant Center property [promotion_id](https://support.google.com/merchants/answer/7050148).
     * 
     */
    @Import(name="promotionId")
    private @Nullable Output<String> promotionId;

    /**
     * @return Promotion identifier, which is the final component of name. For example, this field is &#34;free_gift&#34;, if name is `projects/*{@literal /}locations/global/catalogs/default_catalog/promotions/free_gift`. The value must be a UTF-8 encoded string with a length limit of 128 characters, and match the pattern: `a-zA-Z*`. For example, id0LikeThis or ID_1_LIKE_THIS. Otherwise, an INVALID_ARGUMENT error is returned. Corresponds to Google Merchant Center property [promotion_id](https://support.google.com/merchants/answer/7050148).
     * 
     */
    public Optional<Output<String>> promotionId() {
        return Optional.ofNullable(this.promotionId);
    }

    private GoogleCloudRetailV2betaPromotionArgs() {}

    private GoogleCloudRetailV2betaPromotionArgs(GoogleCloudRetailV2betaPromotionArgs $) {
        this.promotionId = $.promotionId;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(GoogleCloudRetailV2betaPromotionArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private GoogleCloudRetailV2betaPromotionArgs $;

        public Builder() {
            $ = new GoogleCloudRetailV2betaPromotionArgs();
        }

        public Builder(GoogleCloudRetailV2betaPromotionArgs defaults) {
            $ = new GoogleCloudRetailV2betaPromotionArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param promotionId Promotion identifier, which is the final component of name. For example, this field is &#34;free_gift&#34;, if name is `projects/*{@literal /}locations/global/catalogs/default_catalog/promotions/free_gift`. The value must be a UTF-8 encoded string with a length limit of 128 characters, and match the pattern: `a-zA-Z*`. For example, id0LikeThis or ID_1_LIKE_THIS. Otherwise, an INVALID_ARGUMENT error is returned. Corresponds to Google Merchant Center property [promotion_id](https://support.google.com/merchants/answer/7050148).
         * 
         * @return builder
         * 
         */
        public Builder promotionId(@Nullable Output<String> promotionId) {
            $.promotionId = promotionId;
            return this;
        }

        /**
         * @param promotionId Promotion identifier, which is the final component of name. For example, this field is &#34;free_gift&#34;, if name is `projects/*{@literal /}locations/global/catalogs/default_catalog/promotions/free_gift`. The value must be a UTF-8 encoded string with a length limit of 128 characters, and match the pattern: `a-zA-Z*`. For example, id0LikeThis or ID_1_LIKE_THIS. Otherwise, an INVALID_ARGUMENT error is returned. Corresponds to Google Merchant Center property [promotion_id](https://support.google.com/merchants/answer/7050148).
         * 
         * @return builder
         * 
         */
        public Builder promotionId(String promotionId) {
            return promotionId(Output.of(promotionId));
        }

        public GoogleCloudRetailV2betaPromotionArgs build() {
            return $;
        }
    }

}