// *** WARNING: this file was generated by the Pulumi SDK Generator. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

using System;
using System.Collections.Generic;
using System.Collections.Immutable;
using System.Threading.Tasks;
using Pulumi.Serialization;

namespace Pulumi.GoogleNative.Translate.V3.Inputs
{

    /// <summary>
    /// Represents a single entry for an equivalent term set glossary. This is used for equivalent term sets where each term can be replaced by the other terms in the set.
    /// </summary>
    public sealed class GlossaryTermsSetArgs : global::Pulumi.ResourceArgs
    {
        [Input("terms")]
        private InputList<Inputs.GlossaryTermArgs>? _terms;

        /// <summary>
        /// Each term in the set represents a term that can be replaced by the other terms.
        /// </summary>
        public InputList<Inputs.GlossaryTermArgs> Terms
        {
            get => _terms ?? (_terms = new InputList<Inputs.GlossaryTermArgs>());
            set => _terms = value;
        }

        public GlossaryTermsSetArgs()
        {
        }
        public static new GlossaryTermsSetArgs Empty => new GlossaryTermsSetArgs();
    }
}