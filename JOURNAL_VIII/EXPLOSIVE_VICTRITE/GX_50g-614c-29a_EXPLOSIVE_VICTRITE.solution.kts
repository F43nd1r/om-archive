
solution {
    puzzle = "P100"
    name = "B GA"
    arm(ARM1) {
        number = 1
        position = 0 to 1
        rotation = 3
        size = 1
    }
    glyph(BONDER) {
        position = -1 to 2
        rotation = 0
    }
    glyph(TRIPLEX_BONDER) {
        position = 1 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to 4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to 3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 3 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 3 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 4 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 4 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to 4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to 3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 4 to 0
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -1 to 1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 2 to -1
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
                reset()
                wait(3)
                grab()
                rotateClockwise()
                rotateClockwise()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateClockwise()
                grab()
                pivotClockwise()
                pivotClockwise()
                drop()
                rotateClockwise()
                grab()
                pivotClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                drop()
                rotateClockwise()
                grab()
                pivotClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                drop()
                rotateClockwise()
                grab()
                pivotClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                drop()
                rotateClockwise()
                grab()
                pivotClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateClockwise()
                pivotClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                reset()
            }
        }
        )
    }
}
