
solution {
    puzzle = "P060"
    name = "OVERLAP GC"
    arm(ARM1) {
        number = 1
        position = 2 to -3
        rotation = 1
        size = 1
    }
    glyph(BONDER) {
        position = 1 to -4
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 3 to -4
        rotation = 3
    }
    io(INPUT) {
        index = 0
        position = 1 to -1
        rotation = 2
    }
    io(OUTPUT) {
        index = 0
        position = 0 to -3
        rotation = -2
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
                rotateClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                pivotClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                drop()
                rotateClockwise()
                grab()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                drop()
                rotateClockwise()
                grab()
                pivotClockwise()
                rotateClockwise()
                reset()
            }
        }
        )
    }
}
