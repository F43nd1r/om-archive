
solution {
    puzzle = "w2450511665"
    name = "OA"
    arm(ARM1) {
        number = 1
        position = 1 to -1
        rotation = 1
        size = 1
    }
    glyph(BONDER) {
        position = 2 to -2
        rotation = 0
    }
    glyph(MULTI_BONDER) {
        position = 3 to -1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 2 to -2
        rotation = 1
    }
    glyph(UNBONDER) {
        position = 1 to 0
        rotation = 0
    }
    glyph(ANIMISMUS) {
        position = 2 to -1
        rotation = -7
    }
    glyph(DISPOSAL) {
        position = 2 to -1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to -2
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 0 to -1
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 3 to -1
        rotation = -3
    }
    io(OUTPUT) {
        index = 0
        position = 3 to -1
        rotation = -6
    }
    track {
        position = 1 to -1
        positions = listOf(0 to 0, 1 to 0)
    }
    track {
        position = 1 to -1
        positions = listOf(0 to 0, 1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                drop()
                forward()
                grab()
                back()
                forward()
                drop()
                back()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                forward()
                grab()
                back()
                pivotClockwise()
                pivotClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                forward()
                rotateCounterClockwise()
                drop()
                back()
                rotateClockwise()
                rotateClockwise()
                grab()
                forward()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                grab()
                rotateClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                grab()
                rotateCounterClockwise()
                rotateClockwise()
                back()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                forward()
                grab()
                back()
                forward()
                drop()
                back()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                forward()
                grab()
                back()
                pivotClockwise()
                pivotClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                forward()
                rotateCounterClockwise()
                drop()
                back()
                rotateClockwise()
                rotateClockwise()
                grab()
                forward()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                grab()
                rotateClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                grab()
                rotateCounterClockwise()
                rotateClockwise()
                back()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                forward()
                grab()
                back()
                forward()
                drop()
                back()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                forward()
                grab()
                back()
                pivotClockwise()
                pivotClockwise()
                forward()
                drop()
                back()
                rotateClockwise()
                grab()
                forward()
                drop()
                rotateClockwise()
                rotateClockwise()
                back()
                grab()
                forward()
                rotateClockwise()
                rotateClockwise()
                drop()
                back()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                reset()
            }
        }
        )
    }
}
