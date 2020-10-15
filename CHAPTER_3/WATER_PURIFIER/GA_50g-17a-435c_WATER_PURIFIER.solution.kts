
solution {
    puzzle = "P025"
    name = "B GA"
    arm(ARM1) {
        number = 1
        position = 0 to -1
        rotation = 2
        size = 2
    }
    glyph(BONDER) {
        position = -1 to 1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -1 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to 2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 2 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -2 to 1
        rotation = 0
    }
    track {
        position = 0 to -1
        positions = listOf(0 to 0, 1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                forward()
                rotateClockwise()
                back()
                drop()
                forward()
                rotateCounterClockwise()
                back()
                grab()
                forward()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                forward()
                drop()
                rotateClockwise()
                grab()
                back()
                pivotClockwise()
                drop()
                forward()
                rotateCounterClockwise()
                back()
                grab()
                forward()
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                forward()
                drop()
                rotateClockwise()
                back()
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotClockwise()
                drop()
                forward()
                rotateCounterClockwise()
                back()
                grab()
                forward()
                drop()
                rotateClockwise()
                back()
                grab()
                pivotClockwise()
                pivotClockwise()
                drop()
                forward()
                rotateCounterClockwise()
                back()
                grab()
                forward()
                drop()
                rotateClockwise()
                back()
                grab()
                pivotClockwise()
                drop()
                forward()
                grab()
                rotateClockwise()
                reset()
            }
        }
        )
    }
}
