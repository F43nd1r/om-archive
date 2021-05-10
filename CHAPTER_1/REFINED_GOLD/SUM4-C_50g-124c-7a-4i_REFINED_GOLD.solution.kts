
solution {
    puzzle = "P010"
    name = "SUM4"
    arm(ARM6) {
        number = 1
        position = 0 to -1
        rotation = 2
        size = 1
    }
    glyph(PROJECTION) {
        position = -1 to -1
        rotation = 1
    }
    io(OUTPUT) {
        index = 0
        position = 1 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 0 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 1 to -2
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
            }
        }
        )
    }
}
