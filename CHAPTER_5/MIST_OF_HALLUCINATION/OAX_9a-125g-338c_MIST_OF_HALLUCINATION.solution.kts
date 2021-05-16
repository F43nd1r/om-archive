
solution {
    puzzle = "P038"
    name = "OA"
    arm(PISTON) {
        number = 1
        position = -2 to 0
        rotation = -2
        size = 1
    }
    glyph(BONDER) {
        position = -2 to -1
        rotation = 1
    }
    glyph(BONDER) {
        position = 1 to -1
        rotation = 3
    }
    glyph(MULTI_BONDER) {
        position = -1 to 0
        rotation = 1
    }
    glyph(PURIFICATION) {
        position = -2 to -1
        rotation = -1
    }
    io(INPUT) {
        index = 0
        position = 2 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -1 to 0
        rotation = 1
    }
    io(INPUT) {
        index = 1
        position = -2 to -1
        rotation = 0
    }
    track {
        position = -2 to 0
        positions = listOf(0 to 0, 1 to 0, 1 to -1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                forward()
                extend()
                drop()
                retract()
                back()
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                extend()
                drop()
                retract()
                rotateClockwise()
                extend()
                extend()
                grab()
                retract()
                retract()
                drop()
                forward()
                rotateClockwise()
                forward()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                forward()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                extend()
                extend()
                grab()
                retract()
                retract()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                extend()
                extend()
                grab()
                retract()
                retract()
                drop()
                extend()
                extend()
                grab()
                retract()
                drop()
                retract()
                forward()
                reset()
            }
        }
        )
    }
}
