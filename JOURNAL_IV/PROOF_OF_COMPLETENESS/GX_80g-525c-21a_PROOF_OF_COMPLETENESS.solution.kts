
solution {
    puzzle = "P069"
    name = "B GA"
    arm(ARM1) {
        number = 1
        position = 0 to -1
        rotation = -3
        size = 2
    }
    glyph(BONDER) {
        position = 1 to -1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 2 to -2
        rotation = 0
    }
    glyph(DISPERSION) {
        position = 0 to -3
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -2 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 2 to -4
        rotation = -11
    }
    io(OUTPUT) {
        index = 1
        position = -2 to -3
        rotation = -1
    }
    io(OUTPUT) {
        index = 2
        position = 1 to -2
        rotation = 9
    }
    io(OUTPUT) {
        index = 3
        position = -1 to 0
        rotation = 3
    }
    track {
        position = -1 to 0
        positions = listOf(-1 to -2, 0 to -2, 0 to -1, 1 to -1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                forward()
                drop()
                back()
                back()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                forward()
                back()
                back()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                forward()
                forward()
                forward()
                drop()
                back()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                rotateClockwise()
                forward()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                forward()
                drop()
                back()
                back()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                forward()
                drop()
                forward()
                grab()
                pivotCounterClockwise()
                back()
                back()
                back()
                rotateCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                forward()
                forward()
                forward()
                drop()
                back()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                forward()
                grab()
                pivotCounterClockwise()
                back()
                rotateClockwise()
                rotateClockwise()
                back()
                drop()
                forward()
                forward()
                reset()
            }
        }
        )
    }
}
