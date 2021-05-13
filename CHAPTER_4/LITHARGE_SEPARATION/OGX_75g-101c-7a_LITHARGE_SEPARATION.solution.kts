
solution {
    puzzle = "P031b"
    name = "OA"
    arm(ARM1) {
        number = 1
        position = -1 to 1
        rotation = 1
        size = 1
    }
    glyph(UNBONDER) {
        position = 0 to 1
        rotation = 1
    }
    glyph(UNBONDER) {
        position = -2 to 2
        rotation = -1
    }
    glyph(UNBONDER) {
        position = -1 to 1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = -1 to 1
        rotation = 1
    }
    io(OUTPUT) {
        index = 0
        position = -1 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -1 to 2
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = 0 to 1
        rotation = 0
    }
    track {
        position = -1 to 1
        positions = listOf(0 to 0, -1 to 1, 0 to 1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                pivotClockwise()
                drop()
                rotateClockwise()
                forward()
                grab()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                forward()
                grab()
                forward()
                reset()
            }
        }
        )
    }
}
