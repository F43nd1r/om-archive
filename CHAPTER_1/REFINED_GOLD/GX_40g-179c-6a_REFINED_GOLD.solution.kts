
solution {
    puzzle = "P010"
    name = "B GGAGX"
    arm(ARM1) {
        number = 1
        position = 0 to 1
        rotation = 5
        size = 1
    }
    glyph(PROJECTION) {
        position = -1 to 2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 1 to 1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 1 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -1 to 1
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateClockwise()
            }
        }
        )
    }
}
