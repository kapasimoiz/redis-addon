/**
 * Copyright (c) 2013-2016, The SeedStack authors <http://seedstack.org>
 *
 * This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at http://mozilla.org/MPL/2.0/.
 */
package org.seedstack.redis.internal;

import org.seedstack.seed.ErrorCode;

enum RedisErrorCodes implements ErrorCode {
    // Please keep it sorted
    ACCESSING_REDIS_OUTSIDE_TRANSACTION, // TODO missing error code
    MISSING_URL_CONFIGURATION,
    UNABLE_TO_CLOSE_TRANSACTION,
    UNABLE_TO_CREATE_CLIENT,
    UNABLE_TO_LOAD_EXCEPTION_HANDLER_CLASS
}
