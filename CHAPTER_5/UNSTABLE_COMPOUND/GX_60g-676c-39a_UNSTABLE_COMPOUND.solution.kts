
solution {
    puzzle = "P040"
    name = "B GA"
    arm(ARM1) {
        number = 1
        position = 1 to 1
        rotation = 0
        size = 1
    }
    glyph(BONDER) {
        position = 0 to 2
        rotation = -2
    }
    glyph(TRIPLEX_BONDER) {
        position = 3 to -1
        rotation = -4
    }
    glyph(CALCIFICATION) {
        position = 1 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 4 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 5 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to -4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 3 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 4 to -4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 5 to -4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 5 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to -4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 5 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 2 to 1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 1 to -2
        rotation = 2
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
                wait(3)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                reset()
                wait(3)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
                rotateCounterClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
                rotateCounterClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                reset()
                wait(3)
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                pivotClockwise()
                reset()
            }
        }
        )
    }
}
