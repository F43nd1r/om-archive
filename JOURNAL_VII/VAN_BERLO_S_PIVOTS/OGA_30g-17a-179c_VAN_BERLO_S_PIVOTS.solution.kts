
solution {
    puzzle = "P096"
    name = "OG"
    arm(ARM1) {
        number = 1
        position = 1 to 2
        rotation = 5
        size = 2
    }
    glyph(UNBONDER) {
        position = 1 to 0
        rotation = 0
    }
    glyph(DISPOSAL) {
        position = 2 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 3 to 0
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 1 to 0
        rotation = 2
    }
    io(OUTPUT) {
        index = 1
        position = 1 to 0
        rotation = -5
    }
    io(OUTPUT) {
        index = 2
        position = 1 to 0
        rotation = 2
    }
    io(OUTPUT) {
        index = 3
        position = 1 to 0
        rotation = 1
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                pivotClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                pivotClockwise()
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
            }
        }
        )
    }
}
