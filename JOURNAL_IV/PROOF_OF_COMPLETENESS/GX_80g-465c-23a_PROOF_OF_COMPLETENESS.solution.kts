
solution {
    puzzle = "P069"
    name = "B GX"
    arm(ARM1) {
        number = 1
        position = -1 to 1
        rotation = 2
        size = 2
    }
    glyph(BONDER) {
        position = -3 to 0
        rotation = 1
    }
    glyph(CALCIFICATION) {
        position = -4 to 1
        rotation = 0
    }
    glyph(DISPERSION) {
        position = -1 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to -3
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -2 to -2
        rotation = -4
    }
    io(INPUT) {
        index = 0
        position = -3 to 3
        rotation = 0
    }
    io(OUTPUT) {
        index = 1
        position = -2 to 2
        rotation = 3
    }
    io(OUTPUT) {
        index = 2
        position = -4 to 2
        rotation = 7
    }
    io(OUTPUT) {
        index = 3
        position = -5 to 1
        rotation = -1
    }
    track {
        position = -2 to 1
        positions = listOf(0 to 0, 0 to -1, 1 to -1, 1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                forward()
                grab()
                back()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                rotateClockwise()
                forward()
                forward()
                rotateCounterClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                back()
                back()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                forward()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                forward()
                forward()
                rotateClockwise()
                back()
                pivotCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                forward()
                grab()
                rotateClockwise()
                back()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                back()
                rotateClockwise()
                back()
                drop()
                rotateCounterClockwise()
                forward()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                back()
                back()
                rotateClockwise()
                pivotCounterClockwise()
                back()
                drop()
                forward()
                reset()
            }
        }
        )
    }
}
