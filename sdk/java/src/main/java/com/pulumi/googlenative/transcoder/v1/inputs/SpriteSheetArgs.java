// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.googlenative.transcoder.v1.inputs;

import com.pulumi.core.Output;
import com.pulumi.core.annotations.Import;
import java.lang.Integer;
import java.lang.String;
import java.util.Objects;
import java.util.Optional;
import javax.annotation.Nullable;


/**
 * Sprite sheet configuration.
 * 
 */
public final class SpriteSheetArgs extends com.pulumi.resources.ResourceArgs {

    public static final SpriteSheetArgs Empty = new SpriteSheetArgs();

    /**
     * The maximum number of sprites per row in a sprite sheet. The default is 0, which indicates no maximum limit.
     * 
     */
    @Import(name="columnCount")
    private @Nullable Output<Integer> columnCount;

    /**
     * @return The maximum number of sprites per row in a sprite sheet. The default is 0, which indicates no maximum limit.
     * 
     */
    public Optional<Output<Integer>> columnCount() {
        return Optional.ofNullable(this.columnCount);
    }

    /**
     * End time in seconds, relative to the output file timeline. When `end_time_offset` is not specified, the sprites are generated until the end of the output file.
     * 
     */
    @Import(name="endTimeOffset")
    private @Nullable Output<String> endTimeOffset;

    /**
     * @return End time in seconds, relative to the output file timeline. When `end_time_offset` is not specified, the sprites are generated until the end of the output file.
     * 
     */
    public Optional<Output<String>> endTimeOffset() {
        return Optional.ofNullable(this.endTimeOffset);
    }

    /**
     * File name prefix for the generated sprite sheets. Each sprite sheet has an incremental 10-digit zero-padded suffix starting from 0 before the extension, such as `sprite_sheet0000000123.jpeg`.
     * 
     */
    @Import(name="filePrefix", required=true)
    private Output<String> filePrefix;

    /**
     * @return File name prefix for the generated sprite sheets. Each sprite sheet has an incremental 10-digit zero-padded suffix starting from 0 before the extension, such as `sprite_sheet0000000123.jpeg`.
     * 
     */
    public Output<String> filePrefix() {
        return this.filePrefix;
    }

    /**
     * Format type. The default is `jpeg`. Supported formats: - `jpeg`
     * 
     */
    @Import(name="format")
    private @Nullable Output<String> format;

    /**
     * @return Format type. The default is `jpeg`. Supported formats: - `jpeg`
     * 
     */
    public Optional<Output<String>> format() {
        return Optional.ofNullable(this.format);
    }

    /**
     * Starting from `0s`, create sprites at regular intervals. Specify the interval value in seconds.
     * 
     */
    @Import(name="interval")
    private @Nullable Output<String> interval;

    /**
     * @return Starting from `0s`, create sprites at regular intervals. Specify the interval value in seconds.
     * 
     */
    public Optional<Output<String>> interval() {
        return Optional.ofNullable(this.interval);
    }

    /**
     * The quality of the generated sprite sheet. Enter a value between 1 and 100, where 1 is the lowest quality and 100 is the highest quality. The default is 100. A high quality value corresponds to a low image data compression ratio.
     * 
     */
    @Import(name="quality")
    private @Nullable Output<Integer> quality;

    /**
     * @return The quality of the generated sprite sheet. Enter a value between 1 and 100, where 1 is the lowest quality and 100 is the highest quality. The default is 100. A high quality value corresponds to a low image data compression ratio.
     * 
     */
    public Optional<Output<Integer>> quality() {
        return Optional.ofNullable(this.quality);
    }

    /**
     * The maximum number of rows per sprite sheet. When the sprite sheet is full, a new sprite sheet is created. The default is 0, which indicates no maximum limit.
     * 
     */
    @Import(name="rowCount")
    private @Nullable Output<Integer> rowCount;

    /**
     * @return The maximum number of rows per sprite sheet. When the sprite sheet is full, a new sprite sheet is created. The default is 0, which indicates no maximum limit.
     * 
     */
    public Optional<Output<Integer>> rowCount() {
        return Optional.ofNullable(this.rowCount);
    }

    /**
     * The height of sprite in pixels. Must be an even integer. To preserve the source aspect ratio, set the SpriteSheet.sprite_height_pixels field or the SpriteSheet.sprite_width_pixels field, but not both (the API will automatically calculate the missing field).
     * 
     */
    @Import(name="spriteHeightPixels", required=true)
    private Output<Integer> spriteHeightPixels;

    /**
     * @return The height of sprite in pixels. Must be an even integer. To preserve the source aspect ratio, set the SpriteSheet.sprite_height_pixels field or the SpriteSheet.sprite_width_pixels field, but not both (the API will automatically calculate the missing field).
     * 
     */
    public Output<Integer> spriteHeightPixels() {
        return this.spriteHeightPixels;
    }

    /**
     * The width of sprite in pixels. Must be an even integer. To preserve the source aspect ratio, set the SpriteSheet.sprite_width_pixels field or the SpriteSheet.sprite_height_pixels field, but not both (the API will automatically calculate the missing field).
     * 
     */
    @Import(name="spriteWidthPixels", required=true)
    private Output<Integer> spriteWidthPixels;

    /**
     * @return The width of sprite in pixels. Must be an even integer. To preserve the source aspect ratio, set the SpriteSheet.sprite_width_pixels field or the SpriteSheet.sprite_height_pixels field, but not both (the API will automatically calculate the missing field).
     * 
     */
    public Output<Integer> spriteWidthPixels() {
        return this.spriteWidthPixels;
    }

    /**
     * Start time in seconds, relative to the output file timeline. Determines the first sprite to pick. The default is `0s`.
     * 
     */
    @Import(name="startTimeOffset")
    private @Nullable Output<String> startTimeOffset;

    /**
     * @return Start time in seconds, relative to the output file timeline. Determines the first sprite to pick. The default is `0s`.
     * 
     */
    public Optional<Output<String>> startTimeOffset() {
        return Optional.ofNullable(this.startTimeOffset);
    }

    /**
     * Total number of sprites. Create the specified number of sprites distributed evenly across the timeline of the output media. The default is 100.
     * 
     */
    @Import(name="totalCount")
    private @Nullable Output<Integer> totalCount;

    /**
     * @return Total number of sprites. Create the specified number of sprites distributed evenly across the timeline of the output media. The default is 100.
     * 
     */
    public Optional<Output<Integer>> totalCount() {
        return Optional.ofNullable(this.totalCount);
    }

    private SpriteSheetArgs() {}

    private SpriteSheetArgs(SpriteSheetArgs $) {
        this.columnCount = $.columnCount;
        this.endTimeOffset = $.endTimeOffset;
        this.filePrefix = $.filePrefix;
        this.format = $.format;
        this.interval = $.interval;
        this.quality = $.quality;
        this.rowCount = $.rowCount;
        this.spriteHeightPixels = $.spriteHeightPixels;
        this.spriteWidthPixels = $.spriteWidthPixels;
        this.startTimeOffset = $.startTimeOffset;
        this.totalCount = $.totalCount;
    }

    public static Builder builder() {
        return new Builder();
    }
    public static Builder builder(SpriteSheetArgs defaults) {
        return new Builder(defaults);
    }

    public static final class Builder {
        private SpriteSheetArgs $;

        public Builder() {
            $ = new SpriteSheetArgs();
        }

        public Builder(SpriteSheetArgs defaults) {
            $ = new SpriteSheetArgs(Objects.requireNonNull(defaults));
        }

        /**
         * @param columnCount The maximum number of sprites per row in a sprite sheet. The default is 0, which indicates no maximum limit.
         * 
         * @return builder
         * 
         */
        public Builder columnCount(@Nullable Output<Integer> columnCount) {
            $.columnCount = columnCount;
            return this;
        }

        /**
         * @param columnCount The maximum number of sprites per row in a sprite sheet. The default is 0, which indicates no maximum limit.
         * 
         * @return builder
         * 
         */
        public Builder columnCount(Integer columnCount) {
            return columnCount(Output.of(columnCount));
        }

        /**
         * @param endTimeOffset End time in seconds, relative to the output file timeline. When `end_time_offset` is not specified, the sprites are generated until the end of the output file.
         * 
         * @return builder
         * 
         */
        public Builder endTimeOffset(@Nullable Output<String> endTimeOffset) {
            $.endTimeOffset = endTimeOffset;
            return this;
        }

        /**
         * @param endTimeOffset End time in seconds, relative to the output file timeline. When `end_time_offset` is not specified, the sprites are generated until the end of the output file.
         * 
         * @return builder
         * 
         */
        public Builder endTimeOffset(String endTimeOffset) {
            return endTimeOffset(Output.of(endTimeOffset));
        }

        /**
         * @param filePrefix File name prefix for the generated sprite sheets. Each sprite sheet has an incremental 10-digit zero-padded suffix starting from 0 before the extension, such as `sprite_sheet0000000123.jpeg`.
         * 
         * @return builder
         * 
         */
        public Builder filePrefix(Output<String> filePrefix) {
            $.filePrefix = filePrefix;
            return this;
        }

        /**
         * @param filePrefix File name prefix for the generated sprite sheets. Each sprite sheet has an incremental 10-digit zero-padded suffix starting from 0 before the extension, such as `sprite_sheet0000000123.jpeg`.
         * 
         * @return builder
         * 
         */
        public Builder filePrefix(String filePrefix) {
            return filePrefix(Output.of(filePrefix));
        }

        /**
         * @param format Format type. The default is `jpeg`. Supported formats: - `jpeg`
         * 
         * @return builder
         * 
         */
        public Builder format(@Nullable Output<String> format) {
            $.format = format;
            return this;
        }

        /**
         * @param format Format type. The default is `jpeg`. Supported formats: - `jpeg`
         * 
         * @return builder
         * 
         */
        public Builder format(String format) {
            return format(Output.of(format));
        }

        /**
         * @param interval Starting from `0s`, create sprites at regular intervals. Specify the interval value in seconds.
         * 
         * @return builder
         * 
         */
        public Builder interval(@Nullable Output<String> interval) {
            $.interval = interval;
            return this;
        }

        /**
         * @param interval Starting from `0s`, create sprites at regular intervals. Specify the interval value in seconds.
         * 
         * @return builder
         * 
         */
        public Builder interval(String interval) {
            return interval(Output.of(interval));
        }

        /**
         * @param quality The quality of the generated sprite sheet. Enter a value between 1 and 100, where 1 is the lowest quality and 100 is the highest quality. The default is 100. A high quality value corresponds to a low image data compression ratio.
         * 
         * @return builder
         * 
         */
        public Builder quality(@Nullable Output<Integer> quality) {
            $.quality = quality;
            return this;
        }

        /**
         * @param quality The quality of the generated sprite sheet. Enter a value between 1 and 100, where 1 is the lowest quality and 100 is the highest quality. The default is 100. A high quality value corresponds to a low image data compression ratio.
         * 
         * @return builder
         * 
         */
        public Builder quality(Integer quality) {
            return quality(Output.of(quality));
        }

        /**
         * @param rowCount The maximum number of rows per sprite sheet. When the sprite sheet is full, a new sprite sheet is created. The default is 0, which indicates no maximum limit.
         * 
         * @return builder
         * 
         */
        public Builder rowCount(@Nullable Output<Integer> rowCount) {
            $.rowCount = rowCount;
            return this;
        }

        /**
         * @param rowCount The maximum number of rows per sprite sheet. When the sprite sheet is full, a new sprite sheet is created. The default is 0, which indicates no maximum limit.
         * 
         * @return builder
         * 
         */
        public Builder rowCount(Integer rowCount) {
            return rowCount(Output.of(rowCount));
        }

        /**
         * @param spriteHeightPixels The height of sprite in pixels. Must be an even integer. To preserve the source aspect ratio, set the SpriteSheet.sprite_height_pixels field or the SpriteSheet.sprite_width_pixels field, but not both (the API will automatically calculate the missing field).
         * 
         * @return builder
         * 
         */
        public Builder spriteHeightPixels(Output<Integer> spriteHeightPixels) {
            $.spriteHeightPixels = spriteHeightPixels;
            return this;
        }

        /**
         * @param spriteHeightPixels The height of sprite in pixels. Must be an even integer. To preserve the source aspect ratio, set the SpriteSheet.sprite_height_pixels field or the SpriteSheet.sprite_width_pixels field, but not both (the API will automatically calculate the missing field).
         * 
         * @return builder
         * 
         */
        public Builder spriteHeightPixels(Integer spriteHeightPixels) {
            return spriteHeightPixels(Output.of(spriteHeightPixels));
        }

        /**
         * @param spriteWidthPixels The width of sprite in pixels. Must be an even integer. To preserve the source aspect ratio, set the SpriteSheet.sprite_width_pixels field or the SpriteSheet.sprite_height_pixels field, but not both (the API will automatically calculate the missing field).
         * 
         * @return builder
         * 
         */
        public Builder spriteWidthPixels(Output<Integer> spriteWidthPixels) {
            $.spriteWidthPixels = spriteWidthPixels;
            return this;
        }

        /**
         * @param spriteWidthPixels The width of sprite in pixels. Must be an even integer. To preserve the source aspect ratio, set the SpriteSheet.sprite_width_pixels field or the SpriteSheet.sprite_height_pixels field, but not both (the API will automatically calculate the missing field).
         * 
         * @return builder
         * 
         */
        public Builder spriteWidthPixels(Integer spriteWidthPixels) {
            return spriteWidthPixels(Output.of(spriteWidthPixels));
        }

        /**
         * @param startTimeOffset Start time in seconds, relative to the output file timeline. Determines the first sprite to pick. The default is `0s`.
         * 
         * @return builder
         * 
         */
        public Builder startTimeOffset(@Nullable Output<String> startTimeOffset) {
            $.startTimeOffset = startTimeOffset;
            return this;
        }

        /**
         * @param startTimeOffset Start time in seconds, relative to the output file timeline. Determines the first sprite to pick. The default is `0s`.
         * 
         * @return builder
         * 
         */
        public Builder startTimeOffset(String startTimeOffset) {
            return startTimeOffset(Output.of(startTimeOffset));
        }

        /**
         * @param totalCount Total number of sprites. Create the specified number of sprites distributed evenly across the timeline of the output media. The default is 100.
         * 
         * @return builder
         * 
         */
        public Builder totalCount(@Nullable Output<Integer> totalCount) {
            $.totalCount = totalCount;
            return this;
        }

        /**
         * @param totalCount Total number of sprites. Create the specified number of sprites distributed evenly across the timeline of the output media. The default is 100.
         * 
         * @return builder
         * 
         */
        public Builder totalCount(Integer totalCount) {
            return totalCount(Output.of(totalCount));
        }

        public SpriteSheetArgs build() {
            $.filePrefix = Objects.requireNonNull($.filePrefix, "expected parameter 'filePrefix' to be non-null");
            $.spriteHeightPixels = Objects.requireNonNull($.spriteHeightPixels, "expected parameter 'spriteHeightPixels' to be non-null");
            $.spriteWidthPixels = Objects.requireNonNull($.spriteWidthPixels, "expected parameter 'spriteWidthPixels' to be non-null");
            return $;
        }
    }

}