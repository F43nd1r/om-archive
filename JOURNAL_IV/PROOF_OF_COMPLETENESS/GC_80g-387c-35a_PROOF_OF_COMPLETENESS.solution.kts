
solution {
    puzzle = "P069"
    name = "B GC"
    arm(ARM1) {
        number = 1
        position = -2 to 1
        rotation = 0
        size = 2
    }
    glyph(BONDER) {
        position = -1 to -2
        rotation = 3
    }
    glyph(CALCIFICATION) {
        position = -2 to -1
        rotation = 0
    }
    glyph(DISPERSION) {
        position = 0 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 0 to 1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -3 to 1
        rotation = -2
    }
    io(OUTPUT) {
        index = 1
        position = -4 to 0
        rotation = 5
    }
    io(OUTPUT) {
        index = 2
        position = -4 to 2
        rotation = 10
    }
    io(OUTPUT) {
        index = 3
        position = 2 to -1
        rotation = 2
    }
    track {
        position = -2 to 1
        positions = listOf(1 to 0, 1 to -1, 0 to -1, 0 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                drop()
                back()
                grab()
                rotateClockwise()
                drop()
                forward()
                forward()
                grab()
                forward()
                pivotClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                forward()
                drop()
                forward()
                forward()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                forward()
                pivotClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                pivotCounterClockwise()
                drop()
                forward()
                forward()
                grab()
                rotateClockwise()
                drop()
                back()
                grab()
                rotateClockwise()
                back()
                drop()
                back()
                grab()
                back()
                back()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                grab()
                rotateClockwise()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                back()
                back()
                rotateClockwise()
                rotateClockwise()
                reset()
            }
        }
        )
    }
}
