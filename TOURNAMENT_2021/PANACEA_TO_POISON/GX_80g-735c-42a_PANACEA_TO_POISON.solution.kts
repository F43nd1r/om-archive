
solution {
    puzzle = "w2450511665"
    name = "B GX 6T"
    arm(ARM1) {
        number = 1
        position = 2 to -2
        rotation = 1
        size = 2
    }
    glyph(BONDER) {
        position = 0 to -3
        rotation = -3
    }
    glyph(UNBONDER) {
        position = 4 to -2
        rotation = -3
    }
    glyph(ANIMISMUS) {
        position = 1 to -4
        rotation = -7
    }
    glyph(DISPOSAL) {
        position = 4 to -4
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 0 to -1
        rotation = -6
    }
    io(INPUT) {
        index = 0
        position = 0 to 1
        rotation = -6
    }
    track {
        position = 2 to -2
        positions = listOf(0 to 0, 0 to -1, -1 to -1, -1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                pivotCounterClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                forward()
                forward()
                grab()
                pivotClockwise()
                forward()
                rotateClockwise()
                rotateClockwise()
                back()
                back()
                drop()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                back()
                pivotClockwise()
                rotateClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                back()
                drop()
                forward()
                grab()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                reset()
                grab()
                pivotCounterClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                forward()
                forward()
                grab()
                pivotClockwise()
                forward()
                rotateClockwise()
                rotateClockwise()
                forward()
                forward()
                drop()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                back()
                pivotClockwise()
                rotateClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                back()
                drop()
                back()
                grab()
                rotateClockwise()
                drop()
                back()
                rotateClockwise()
                rotateClockwise()
                reset()
                grab()
                pivotCounterClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                rotateCounterClockwise()
                pivotClockwise()
                back()
                drop()
                forward()
                forward()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                forward()
                drop()
                forward()
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                reset()
                repeat()
                wait(123)
                repeat()
                wait(123)
                repeat()
                wait(123)
                repeat()
                wait(123)
                grab()
                pivotCounterClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                forward()
                forward()
                grab()
                pivotClockwise()
                forward()
                rotateClockwise()
                rotateClockwise()
                back()
                back()
                drop()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                back()
                pivotClockwise()
                rotateClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                back()
                drop()
                forward()
                grab()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                reset()
                grab()
                pivotCounterClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                forward()
                forward()
                grab()
                pivotClockwise()
                forward()
                rotateClockwise()
                rotateClockwise()
                forward()
                forward()
                drop()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                back()
                pivotClockwise()
                rotateClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                back()
                drop()
                back()
                grab()
                rotateClockwise()
                drop()
                back()
                rotateClockwise()
                rotateClockwise()
                reset()
                grab()
                pivotCounterClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                back()
                grab()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                back()
                rotateCounterClockwise()
                pivotClockwise()
                back()
                drop()
                forward()
                forward()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                forward()
                drop()
                forward()
                rotateCounterClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                reset()
            }
        }
        )
    }
}
