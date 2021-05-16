
solution {
    puzzle = "P038"
    name = "NEW SOLUTION 2"
    arm(PISTON) {
        number = 1
        position = 0 to -1
        rotation = -3
        size = 2
    }
    glyph(BONDER) {
        position = -2 to -1
        rotation = 1
    }
    glyph(BONDER) {
        position = 0 to -1
        rotation = 0
    }
    glyph(MULTI_BONDER) {
        position = -1 to 0
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -2 to -1
        rotation = 0
    }
    glyph(PURIFICATION) {
        position = -2 to -1
        rotation = -12
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
        position = -1 to -1
        positions = listOf(0 to 0, 0 to 1, 1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                retract()
                drop()
                extend()
                grab()
                pivotClockwise()
                drop()
                retract()
                grab()
                rotateClockwise()
                drop()
                forward()
                rotateClockwise()
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
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                back()
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
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                extend()
            }
        }
        )
    }
}
