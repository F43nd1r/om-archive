
solution {
    puzzle = "w2450511665"
    name = "OVERLAP AG"
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
    glyph(BONDER) {
        position = 3 to -2
        rotation = 1
    }
    glyph(BONDER) {
        position = 2 to 0
        rotation = -1
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
    io(OUTPUT) {
        index = 0
        position = 3 to -1
        rotation = -6
    }
    io(INPUT) {
        index = 0
        position = 3 to -1
        rotation = -3
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
                forward()
                rotateClockwise()
                rotateClockwise()
                grab()
                back()
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
                rotateClockwise()
                grab()
                rotateCounterClockwise()
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
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
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
                back()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                forward()
                rotateClockwise()
                rotateClockwise()
                reset()
            }
        }
        )
    }
}
