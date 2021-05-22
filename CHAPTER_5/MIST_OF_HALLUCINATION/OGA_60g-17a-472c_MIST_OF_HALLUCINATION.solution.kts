
solution {
    puzzle = "P038"
    name = "OVERLAP GA"
    arm(ARM1) {
        number = 1
        position = -2 to 1
        rotation = 3
        size = 1
    }
    glyph(BONDER) {
        position = -1 to 0
        rotation = 1
    }
    glyph(PURIFICATION) {
        position = -1 to 0
        rotation = 3
    }
    glyph(EQUILIBRIUM) {
        position = -1 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -2 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -1 to 1
        rotation = 2
    }
    io(INPUT) {
        index = 1
        position = -3 to 1
        rotation = 0
    }
    track {
        position = -2 to 0
        positions = listOf(0 to 0, 0 to 1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                forward()
                drop()
                back()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateClockwise()
                pivotClockwise()
                drop()
                rotateClockwise()
                grab()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                back()
                grab()
                forward()
                rotateCounterClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                back()
                grab()
                forward()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
                back()
                drop()
                forward()
                grab()
                pivotCounterClockwise()
                back()
                drop()
                forward()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateCounterClockwise()
                drop()
                back()
                rotateClockwise()
                rotateClockwise()
                grab()
                forward()
                reset()
            }
        }
        )
    }
}
