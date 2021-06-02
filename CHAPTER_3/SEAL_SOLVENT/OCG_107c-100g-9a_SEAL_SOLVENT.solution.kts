
solution {
    puzzle = "P026"
    name = "NEW SOLUTION 2"
    arm(PISTON) {
        number = 1
        position = 3 to 0
        rotation = 3
        size = 2
    }
    glyph(BONDER) {
        position = 2 to -1
        rotation = 0
    }
    glyph(BONDER) {
        position = 3 to 0
        rotation = -2
    }
    glyph(CALCIFICATION) {
        position = 3 to 0
        rotation = 0
    }
    glyph(PROJECTION) {
        position = 2 to 0
        rotation = -2
    }
    io(INPUT) {
        index = 0
        position = 3 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 3 to 0
        rotation = -3
    }
    io(INPUT) {
        index = 1
        position = 1 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = 1 to 0
        rotation = 0
    }
    track {
        position = 4 to -1
        positions = listOf(0 to 0, -1 to 1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                retract()
                drop()
                back()
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                extend()
                grab()
                retract()
                reset()
            }
        }
        )
    }
}
