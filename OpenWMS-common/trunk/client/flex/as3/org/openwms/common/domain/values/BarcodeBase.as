/**
 * Generated by Gas3 v2.0.0 (Granite Data Services).
 *
 * WARNING: DO NOT CHANGE THIS FILE. IT MAY BE OVERWRITTEN EACH TIME YOU USE
 * THE GENERATOR. INSTEAD, EDIT THE INHERITED CLASS (Barcode.as).
 */

package org.openwms.common.domain.values {

    import flash.utils.IDataInput;
    import flash.utils.IDataOutput;
    import flash.utils.IExternalizable;

    [Bindable]
    public class BarcodeBase implements IExternalizable {

        private var _id:String;

        public function get id():String {
            return _id;
        }

        public function readExternal(input:IDataInput):void {
            _id = input.readObject() as String;
        }

        public function writeExternal(output:IDataOutput):void {
            output.writeObject(_id);
        }
    }
}