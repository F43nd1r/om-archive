
solution {
    puzzle = "P068"
    name = "B GA"
    arm(ARM1) {
        number = 1
        position = 0 to -1
        rotation = 9
        size = 2
    }
    glyph(BONDER) {
        position = 0 to 1
        rotation = 12
    }
    glyph(UNBONDER) {
        position = -1 to -2
        rotation = 7
    }
    glyph(PURIFICATION) {
        position = -2 to 1
        rotation = 5
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 3 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to 3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 5 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 5 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to -2
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 3 to -1
        rotation = 7
    }
    io(INPUT) {
        index = 0
        position = -3 to 0
        rotation = 8
    }
    track {
        position = 1 to -2
        positions = listOf(0 to 0, 0 to 1, -1 to 1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                forward()
                drop()
                back()
                grab()
                forward()
                drop()
                forward()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                grab()
                pivotClockwise()
                drop()
                forward()
                grab()
                rotateClockwise()
                forward()
                rotateClockwise()
                forward()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                pivotClockwise()
                drop()
                forward()
                grab()
                rotateClockwise()
                forward()
                rotateClockwise()
                back()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                grab()
                pivotClockwise()
                drop()
                forward()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                grab()
                pivotClockwise()
                back()
                rotateClockwise()
                forward()
                rotateClockwise()
                forward()
                rotateCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                pivotClockwise()
                drop()
                rotateClockwise()
                grab()
                back()
                rotateCounterClockwise()
                drop()
                back()
                grab()
                rotateClockwise()
                rotateClockwise()
                forward()
                drop()
                rotateClockwise()
                back()
                grab()
                rotateCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                grab()
                forward()
                rotateClockwise()
                back()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                pivotCounterClockwise()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                grab()
                forward()
                drop()
                back()
                grab()
                forward()
                drop()
                forward()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                grab()
                pivotClockwise()
                drop()
                forward()
                grab()
                rotateClockwise()
                forward()
                rotateClockwise()
                drop()
                back()
                grab()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                grab()
                pivotClockwise()
                drop()
                forward()
                grab()
                rotateClockwise()
                forward()
                rotateClockwise()
                back()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                grab()
                pivotClockwise()
                drop()
                forward()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                grab()
                pivotClockwise()
                back()
                rotateClockwise()
                forward()
                rotateClockwise()
                rotateCounterClockwise()
                forward()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                forward()
                drop()
                rotateClockwise()
                back()
                grab()
                back()
                rotateCounterClockwise()
                drop()
                back()
                grab()
                rotateClockwise()
                forward()
                drop()
                forward()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                forward()
                grab()
                back()
                rotateClockwise()
                drop()
                forward()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                back()
                grab()
                back()
                drop()
                rotateClockwise()
                forward()
                grab()
                rotateCounterClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                back()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                grab()
                forward()
                rotateClockwise()
                forward()
                rotateClockwise()
                drop()
                back()
                grab()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                drop()
                forward()
                grab()
                back()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                grab()
                rotateClockwise()
                forward()
                rotateClockwise()
                drop()
                forward()
                grab()
                back()
                pivotCounterClockwise()
                back()
                drop()
                back()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                back()
                forward()
                drop()
                forward()
                grab()
                forward()
                drop()
                back()
                rotateClockwise()
                grab()
                pivotClockwise()
                drop()
                forward()
                grab()
                back()
                drop()
                forward()
                grab()
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
                drop()
                forward()
                grab()
                back()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                back()
                forward()
                drop()
                rotateClockwise()
                forward()
                grab()
                forward()
                drop()
                back()
                grab()
                pivotClockwise()
                drop()
                forward()
                grab()
                back()
                drop()
                forward()
                grab()
                back()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                back()
                forward()
                drop()
                rotateClockwise()
                forward()
                grab()
                forward()
                drop()
                back()
                grab()
                pivotClockwise()
                drop()
                forward()
                grab()
                back()
                drop()
                forward()
                grab()
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
                drop()
                forward()
                grab()
                back()
                forward()
                drop()
                back()
                grab()
                forward()
                drop()
                rotateCounterClockwise()
                reset()
            }
        }
        )
    }
}
