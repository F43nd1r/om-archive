
solution {
    puzzle = "P026"
    name = "B GC"
    arm(ARM1) {
        number = 1
        position = 4 to 0
        rotation = 1
        size = 2
    }
    glyph(BONDER) {
        position = 2 to 2
        rotation = 2
    }
    glyph(CALCIFICATION) {
        position = 1 to 2
        rotation = 0
    }
    glyph(PROJECTION) {
        position = 3 to -1
        rotation = 5
    }
    io(OUTPUT) {
        index = 0
        position = 1 to -1
        rotation = 6
    }
    io(INPUT) {
        index = 0
        position = 4 to 2
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 6 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = 5 to -1
        rotation = 0
    }
    track {
        position = 3 to 1
        positions = listOf(0 to 0, 1 to -1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                back()
                rotateCounterClockwise()
                pivotClockwise()
                forward()
                drop()
                rotateClockwise()
                grab()
                back()
                rotateCounterClockwise()
                pivotClockwise()
                forward()
                drop()
                rotateClockwise()
                grab()
                back()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                forward()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                rotateCounterClockwise()
                reset()
            }
        }
        )
    }
}
