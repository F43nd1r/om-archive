
solution {
    puzzle = "P097"
    name = "B GAX 6T"
    arm(ARM1) {
        number = 1
        position = 1 to 0
        rotation = 4
        size = 2
    }
    glyph(BONDER) {
        position = -1 to -1
        rotation = 1
    }
    glyph(EQUILIBRIUM) {
        position = 3 to -4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to 4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to 4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 5
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 22
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to 22
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to 20
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 3 to 19
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 6 to 17
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to 21
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to 21
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 4 to 19
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 5 to 18
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 7 to 17
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 8 to 16
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 9 to 15
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 10 to 14
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 13 to 11
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 13 to 10
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 16 to 7
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 16 to 6
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 17 to 5
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 18 to 4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 15 to 8
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 14 to 9
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 12 to 12
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 11 to 13
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 21
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -4 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -3 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to -4
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
        position = 0 to -4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to -4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to 10
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 3 to 9
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 4 to 8
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 4 to 9
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 4 to 10
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 20
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 19
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 18
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 17
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 16
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 15
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 14
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 13
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 12
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 11
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 10
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 9
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 8
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 7
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -2 to 6
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 1 to -2
        rotation = 0
    }
    io(INFINITE) {
        index = 0
        position = -5 to 2
        rotation = 0
    }
    io(INPUT) {
        index = 2
        position = 3 to -3
        rotation = 0
    }
    track {
        position = 1 to -1
        positions = listOf(0 to 0, 0 to 1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                back()
                rotateClockwise()
                forward()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                back()
                rotateClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                grab()
                back()
                rotateClockwise()
                forward()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                back()
                rotateClockwise()
                forward()
                drop()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                grab()
                back()
                rotateClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                grab()
                back()
                rotateClockwise()
                forward()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                back()
                rotateClockwise()
                rotateClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                back()
                rotateClockwise()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                forward()
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                drop()
                rotateClockwise()
                back()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                forward()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                reset()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                back()
                rotateClockwise()
                forward()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                back()
                rotateClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                grab()
                back()
                rotateClockwise()
                pivotCounterClockwise()
                forward()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                back()
                rotateClockwise()
                forward()
                drop()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                forward()
                grab()
                back()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                forward()
                rotateClockwise()
                grab()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                grab()
                back()
                rotateClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                grab()
                back()
                rotateClockwise()
                forward()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                back()
                rotateClockwise()
                rotateClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                back()
                rotateClockwise()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                forward()
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                drop()
                rotateClockwise()
                back()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                forward()
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                reset()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                back()
                rotateClockwise()
                forward()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                back()
                rotateClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                grab()
                back()
                rotateClockwise()
                pivotCounterClockwise()
                forward()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                back()
                rotateClockwise()
                forward()
                drop()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                forward()
                grab()
                back()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                forward()
                grab()
                pivotClockwise()
                rotateCounterClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                grab()
                back()
                rotateClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                grab()
                back()
                rotateClockwise()
                forward()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                back()
                rotateClockwise()
                rotateClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                back()
                rotateClockwise()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                forward()
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                drop()
                rotateClockwise()
                back()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                forward()
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                reset()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                back()
                rotateClockwise()
                forward()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                back()
                rotateClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                grab()
                back()
                rotateClockwise()
                pivotCounterClockwise()
                forward()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                back()
                rotateClockwise()
                forward()
                drop()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                forward()
                grab()
                back()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                forward()
                grab()
                pivotClockwise()
                rotateCounterClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                grab()
                back()
                rotateClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                grab()
                back()
                rotateClockwise()
                forward()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                back()
                rotateClockwise()
                rotateClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                back()
                rotateClockwise()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                forward()
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                drop()
                rotateClockwise()
                back()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                forward()
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                reset()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                back()
                rotateClockwise()
                forward()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                back()
                rotateClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                grab()
                back()
                rotateClockwise()
                pivotCounterClockwise()
                forward()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                back()
                rotateClockwise()
                forward()
                drop()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                forward()
                grab()
                back()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                forward()
                grab()
                pivotClockwise()
                rotateCounterClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                grab()
                back()
                rotateClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                grab()
                back()
                rotateClockwise()
                forward()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                back()
                rotateClockwise()
                rotateClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                back()
                rotateClockwise()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                forward()
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                drop()
                rotateClockwise()
                back()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                forward()
                grab()
                rotateCounterClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                reset()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                back()
                rotateClockwise()
                forward()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                back()
                rotateClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                grab()
                back()
                rotateClockwise()
                pivotCounterClockwise()
                forward()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                back()
                rotateClockwise()
                forward()
                drop()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                forward()
                grab()
                back()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                forward()
                grab()
                pivotClockwise()
                rotateCounterClockwise()
                rotateClockwise()
                drop()
                back()
                grab()
                forward()
                drop()
                rotateCounterClockwise()
                reset()
                grab()
                rotateClockwise()
                drop()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
                forward()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                back()
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                grab()
                back()
                rotateClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                drop()
                forward()
                grab()
                rotateClockwise()
                drop()
                back()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                forward()
                grab()
                pivotClockwise()
                back()
                pivotClockwise()
                drop()
                rotateClockwise()
                grab()
                pivotClockwise()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                forward()
                grab()
                back()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                rotateClockwise()
                forward()
                grab()
                back()
                drop()
                forward()
                grab()
                pivotCounterClockwise()
                pivotClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                reset()
            }
        }
        )
    }
}
