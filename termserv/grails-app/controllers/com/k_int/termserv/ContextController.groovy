package com.k_int.termserv

import com.gmongo.GMongo

class ContextController {


  // Called with params.ctx
  def index() { 

    def result = [:]

    def mongo = new com.gmongo.GMongo();
    def termserv_db = mongo.getDB("kitermserv")

    if ( ( params.q != null ) && ( params.ctx != null ) ) {

      // Lookup context ctx
      // If not found, does user have perms to create? if so, create if flag set.

      log.debug("Lookup term ${params.q}");

      def located_term = termserv_db.terms.findOne(context: params.ctx, identifier: params.q)

      // def mongo_store_result = termserv_db.terms.save(term_as_pojo)

      // Try to find a term where candidate_identifier == params.q

      // If params.add=true and the term is not found, check for it's presence in the candidate term list and add it if not found.
    }
    result;
  }
}
