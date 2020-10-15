
solution {
    puzzle = "P042"
    name = "B GA"
    arm(ARM1) {
        number = 1
        position = 0 to -1
        rotation = 3
        size = 2
    }
    glyph(BONDER) {
        position = -2 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to 4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to 3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to 5
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to 5
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 5
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to 5
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to 5
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 3 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -2 to -1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 1 to 2
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = -3 to -1
        rotation = 0
    }
    track {
        position = -1 to -1
        positions = listOf(0 to 0, 1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                rotateClockwise()
                back()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                forward()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateClockwise()
                grab()
                back()
                pivotClockwise()
                drop()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateClockwise()
                back()
                grab()
                pivotClockwise()
                drop()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateClockwise()
                back()
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                back()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                pivotCounterClockwise()
                back()
                forward()
                pivotCounterClockwise()
                drop()
                back()
                grab()
                forward()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                back()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                pivotCounterClockwise()
                back()
                forward()
                drop()
                back()
                grab()
                pivotClockwise()
                drop()
                forward()
                grab()
                back()
                forward()
                pivotCounterClockwise()
                drop()
                back()
                grab()
                forward()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                back()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                pivotCounterClockwise()
                back()
                forward()
                drop()
                back()
                grab()
                pivotClockwise()
                drop()
                forward()
                grab()
                back()
                forward()
                pivotCounterClockwise()
                drop()
                back()
                grab()
                forward()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                back()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                pivotCounterClockwise()
                back()
                forward()
                drop()
                back()
                grab()
                pivotClockwise()
                drop()
                forward()
                grab()
                back()
                forward()
                pivotCounterClockwise()
                drop()
                back()
                grab()
                forward()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                back()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                pivotCounterClockwise()
                back()
                forward()
                drop()
                back()
                grab()
                pivotClockwise()
                drop()
                forward()
                grab()
                back()
                forward()
                pivotCounterClockwise()
                drop()
                back()
                grab()
                forward()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                back()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                pivotCounterClockwise()
                back()
                forward()
                drop()
                back()
                grab()
                pivotClockwise()
                drop()
                forward()
                grab()
                back()
                forward()
                pivotCounterClockwise()
                drop()
                back()
                grab()
                pivotCounterClockwise()
                pivotClockwise()
                forward()
                reset()
            }
        }
        )
    }
}
