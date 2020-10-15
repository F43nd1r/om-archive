
solution {
    puzzle = "P108"
    name = "B GA"
    arm(ARM1) {
        number = 1
        position = -5 to 0
        rotation = -2
        size = 2
    }
    glyph(BONDER) {
        position = -3 to 0
        rotation = -2
    }
    glyph(UNBONDER) {
        position = -7 to 2
        rotation = -1
    }
    glyph(PROJECTION) {
        position = -4 to -2
        rotation = 4
    }
    glyph(ANIMISMUS) {
        position = -3 to -2
        rotation = 5
    }
    glyph(DISPOSAL) {
        position = -5 to 2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to 3
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -1 to 0
        rotation = 3
    }
    io(INPUT) {
        index = 0
        position = -7 to 1
        rotation = 28
    }
    io(INPUT) {
        index = 1
        position = -6 to 0
        rotation = 4
    }
    io(INPUT) {
        index = 2
        position = -5 to -2
        rotation = 0
    }
    track {
        position = -3 to 0
        positions = listOf(-2 to 0, -1 to 0, -1 to -1, -2 to -1)
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
                forward()
                forward()
                drop()
                back()
                rotateClockwise()
                forward()
                grab()
                back()
                drop()
                rotateClockwise()
                forward()
                grab()
                pivotCounterClockwise()
                back()
                back()
                forward()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                forward()
                grab()
                back()
                rotateClockwise()
                back()
                drop()
                back()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                back()
                drop()
                rotateClockwise()
                forward()
                grab()
                pivotCounterClockwise()
                back()
                back()
                forward()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                forward()
                grab()
                back()
                rotateClockwise()
                back()
                drop()
                back()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                back()
                drop()
                rotateClockwise()
                forward()
                grab()
                pivotCounterClockwise()
                back()
                back()
                forward()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                forward()
                grab()
                back()
                rotateClockwise()
                back()
                drop()
                back()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                back()
                drop()
                rotateClockwise()
                forward()
                grab()
                pivotCounterClockwise()
                back()
                back()
                forward()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
                forward()
                grab()
                back()
                rotateCounterClockwise()
                back()
                back()
                rotateCounterClockwise()
                forward()
                pivotClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                back()
                rotateCounterClockwise()
                forward()
                forward()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                grab()
                rotateClockwise()
                back()
                back()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                forward()
                pivotCounterClockwise()
                forward()
                rotateClockwise()
                back()
                back()
                rotateClockwise()
                rotateClockwise()
                back()
                drop()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                grab()
                rotateClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                grab()
                forward()
                pivotCounterClockwise()
                forward()
                rotateClockwise()
                back()
                rotateClockwise()
                rotateClockwise()
                drop()
                forward()
                grab()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                back()
                grab()
                rotateClockwise()
                forward()
                drop()
                rotateClockwise()
                back()
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                drop()
                back()
                rotateCounterClockwise()
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
                forward()
                grab()
                back()
                rotateCounterClockwise()
                pivotClockwise()
                back()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                forward()
                forward()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                forward()
                grab()
                forward()
                pivotCounterClockwise()
                drop()
                back()
                back()
                grab()
                rotateClockwise()
                forward()
                rotateClockwise()
                drop()
                forward()
                forward()
                grab()
                back()
                pivotCounterClockwise()
                forward()
                drop()
                rotateClockwise()
                rotateClockwise()
                back()
                grab()
                rotateCounterClockwise()
                back()
                rotateCounterClockwise()
                drop()
                forward()
                grab()
                pivotClockwise()
                forward()
                drop()
                back()
                grab()
                forward()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                grab()
                forward()
                rotateClockwise()
                back()
                back()
                rotateClockwise()
                rotateClockwise()
                back()
                drop()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                forward()
                pivotCounterClockwise()
                forward()
                rotateClockwise()
                back()
                rotateClockwise()
                rotateClockwise()
                drop()
                forward()
                grab()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                back()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                grab()
                rotateClockwise()
                forward()
                forward()
                rotateClockwise()
                back()
                pivotCounterClockwise()
                drop()
                forward()
                forward()
                grab()
                back()
                drop()
                forward()
                grab()
                back()
                back()
                rotateCounterClockwise()
                back()
                drop()
                forward()
                forward()
                grab()
                back()
                pivotCounterClockwise()
                back()
                drop()
                forward()
                forward()
                grab()
                back()
                back()
                drop()
                forward()
                forward()
                rotateClockwise()
                grab()
                forward()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                forward()
                grab()
                forward()
                pivotCounterClockwise()
                forward()
                rotateClockwise()
                back()
                back()
                rotateClockwise()
                rotateClockwise()
                back()
                drop()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                forward()
                grab()
                forward()
                pivotCounterClockwise()
                forward()
                rotateClockwise()
                back()
                back()
                drop()
                back()
                grab()
                back()
                drop()
                forward()
                forward()
                grab()
                rotateClockwise()
                forward()
                rotateClockwise()
                drop()
                forward()
                grab()
                back()
                rotateCounterClockwise()
                back()
                rotateCounterClockwise()
                forward()
                drop()
                forward()
                grab()
                forward()
                forward()
                rotateClockwise()
                forward()
                drop()
                rotateClockwise()
                back()
                grab()
                rotateCounterClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                grab()
                rotateClockwise()
                forward()
                rotateClockwise()
                forward()
                drop()
                rotateClockwise()
                back()
                grab()
                rotateCounterClockwise()
                rotateClockwise()
                forward()
                pivotClockwise()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                forward()
                grab()
                back()
                drop()
                forward()
                grab()
                back()
                drop()
                back()
                back()
                grab()
                back()
                back()
                drop()
                rotateClockwise()
                back()
                grab()
                pivotCounterClockwise()
                rotateCounterClockwise()
                back()
                drop()
                rotateCounterClockwise()
                forward()
                forward()
                grab()
                back()
                back()
                drop()
                rotateClockwise()
                forward()
                grab()
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
