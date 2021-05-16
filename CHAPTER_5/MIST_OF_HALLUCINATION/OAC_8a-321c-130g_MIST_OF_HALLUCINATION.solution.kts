
solution {
    puzzle = "P038"
    name = "OAC"
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
        position = 0 to -1
        rotation = 0
    }
    glyph(MULTI_BONDER) {
        position = -1 to 0
        rotation = 1
    }
    glyph(PURIFICATION) {
        position = -1 to 0
        rotation = -2
    }
    io(INPUT) {
        index = 0
        position = 0 to -2
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
        position = 1 to -3
        positions = listOf(-3 to 3, -2 to 2, -1 to 2, -2 to 3)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                forward()
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                extend()
                drop()
                retract()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                rotateCounterClockwise()
                grab()
                forward()
                rotateClockwise()
                drop()
                back()
                back()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                extend()
                drop()
                retract()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                back()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                back()
                rotateClockwise()
                rotateClockwise()
            }
        }
        )
    }
}
