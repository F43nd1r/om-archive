
solution {
    puzzle = "P026"
    name = "OVERLAP AREA"
    arm(ARM1) {
        number = 1
        position = -1 to -1
        rotation = -3
        size = 1
    }
    glyph(BONDER) {
        position = 0 to -1
        rotation = 0
    }
    glyph(BONDER) {
        position = -1 to -2
        rotation = 0
    }
    glyph(BONDER) {
        position = -2 to -1
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -2 to 0
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -1 to -2
        rotation = 0
    }
    glyph(PROJECTION) {
        position = -1 to 0
        rotation = 5
    }
    io(OUTPUT) {
        index = 0
        position = 0 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 0 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -2 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = -1 to -2
        rotation = 0
    }
    track {
        position = -1 to -1
        positions = listOf(0 to 0, 1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateClockwise()
                grab()
                forward()
                drop()
                back()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        )
    }
}
