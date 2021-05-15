
solution {
    puzzle = "P028"
    name = "OA"
    arm(PISTON) {
        number = 1
        position = 1 to -2
        rotation = 1
        size = 1
    }
    glyph(BONDER) {
        position = -1 to 0
        rotation = -1
    }
    glyph(BONDER) {
        position = 0 to -2
        rotation = 1
    }
    glyph(MULTI_BONDER) {
        position = 1 to -1
        rotation = 1
    }
    glyph(CALCIFICATION) {
        position = 1 to 0
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 0 to -1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 2 to -2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 0 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 1 to -3
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -1 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = 1 to -1
        rotation = 0
    }
    track {
        position = 1 to -2
        positions = listOf(0 to 0, -1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                extend()
                drop()
                retract()
                forward()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                back()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                grab()
                retract()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                reset()
            }
        }
        )
    }
}
