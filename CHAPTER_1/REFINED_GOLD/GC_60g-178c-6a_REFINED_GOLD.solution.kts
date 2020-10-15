
solution {
    puzzle = "P010"
    name = "B AC"
    arm(PISTON) {
        number = 1
        position = 1 to -2
        rotation = 0
        size = 1
    }
    glyph(PROJECTION) {
        position = 0 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 2 to -2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 1 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 0 to -2
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
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
                extend()
                reset()
            }
        }
        )
    }
}
