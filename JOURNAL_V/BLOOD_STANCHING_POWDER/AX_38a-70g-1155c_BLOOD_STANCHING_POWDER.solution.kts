
solution {
    puzzle = "P087"
    name = "B AGX"
    arm(ARM1) {
        number = 1
        position = -6 to 1
        rotation = 4
        size = 2
    }
    glyph(BONDER) {
        position = -5 to -1
        rotation = 0
    }
    glyph(BONDER) {
        position = -4 to -3
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = -6 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to -4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -6 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -5 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to -4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to -4
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -1 to -2
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -6 to -1
        rotation = 0
    }
    track {
        position = -3 to 0
        positions = listOf(-2 to 0, -3 to 1, -2 to 1, -1 to 1)
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
                forward()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateCounterClockwise()
                back()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                forward()
                forward()
                pivotClockwise()
                drop()
                back()
                back()
                grab()
                forward()
                drop()
                forward()
                grab()
                pivotClockwise()
                back()
                forward()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                back()
                back()
                grab()
                forward()
                forward()
                pivotClockwise()
                drop()
                back()
                back()
                grab()
                forward()
                pivotCounterClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                grab()
                rotateClockwise()
                forward()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                back()
                back()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                forward()
                rotateCounterClockwise()
                back()
                drop()
                rotateClockwise()
                grab()
                forward()
                pivotClockwise()
                forward()
                drop()
                back()
                back()
                grab()
                forward()
                drop()
                forward()
                grab()
                pivotClockwise()
                back()
                drop()
                rotateCounterClockwise()
                forward()
                grab()
                back()
                back()
                forward()
                forward()
                drop()
                back()
                back()
                back()
                grab()
                forward()
                forward()
                drop()
                back()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                forward()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                back()
                grab()
                pivotClockwise()
                pivotCounterClockwise()
                drop()
                forward()
                grab()
                forward()
                drop()
                back()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                forward()
                rotateCounterClockwise()
                drop()
                back()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                forward()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                forward()
                drop()
                back()
                back()
                grab()
                forward()
                pivotClockwise()
                forward()
                drop()
                back()
                back()
                grab()
                forward()
                drop()
                forward()
                grab()
                pivotClockwise()
                back()
                drop()
                rotateCounterClockwise()
                grab()
                back()
                forward()
                pivotCounterClockwise()
                back()
                drop()
                forward()
                forward()
                rotateClockwise()
                grab()
                back()
                drop()
                rotateCounterClockwise()
                forward()
                grab()
                back()
                back()
                forward()
                forward()
                reset()
            }
        }
        )
    }
}
