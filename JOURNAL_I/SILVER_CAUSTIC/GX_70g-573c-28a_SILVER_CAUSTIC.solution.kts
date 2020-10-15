
solution {
    puzzle = "P057"
    name = "B GA"
    arm(ARM1) {
        number = 1
        position = 3 to -3
        rotation = 0
        size = 2
    }
    glyph(BONDER) {
        position = 3 to -1
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 4 to 0
        rotation = 0
    }
    glyph(PROJECTION) {
        position = 1 to -1
        rotation = -1
    }
    glyph(EQUILIBRIUM) {
        position = 1 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 4 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 5 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 6 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 5 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 3 to 1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 2 to 0
        rotation = 2
    }
    io(INPUT) {
        index = 0
        position = 6 to -3
        rotation = 0
    }
    io(INPUT) {
        index = 1
        position = 5 to -3
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = 2 to -3
        rotation = 0
    }
    io(INPUT) {
        index = 3
        position = 1 to -3
        rotation = 0
    }
    track {
        position = 4 to -3
        positions = listOf(0 to 0, -1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                back()
                grab()
                rotateCounterClockwise()
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
                rotateClockwise()
                drop()
                back()
                grab()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                forward()
                rotateClockwise()
                drop()
                back()
                grab()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                forward()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                back()
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                forward()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                back()
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                pivotClockwise()
                drop()
                rotateClockwise()
                grab()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                back()
                grab()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
                reset()
            }
        }
        )
    }
}
