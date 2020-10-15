
solution {
    puzzle = "P098"
    name = "B GX"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = -2 to -1
        rotation = 5
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 2 to -5
        rotation = 1
        size = 2
    }
    glyph(BONDER) {
        position = 1 to -2
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 0 to -1
        rotation = 6
    }
    glyph(DUPLICATION) {
        position = -1 to -1
        rotation = 5
    }
    glyph(PURIFICATION) {
        position = 0 to -4
        rotation = -6
    }
    glyph(EQUILIBRIUM) {
        position = 1 to -5
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 1 to 0
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = -1 to -3
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 4 to -4
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 2 to -3
        rotation = 9
    }
    io(OUTPUT) {
        index = 0
        position = 4 to -2
        rotation = 4
    }
    io(INPUT) {
        index = 1
        position = 0 to -5
        rotation = 0
    }
    track {
        position = 1 to -4
        positions = listOf(2 to 0, 1 to 0, 1 to -1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                wait(13)
                rotateCounterClockwise()
                wait(35)
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(10)
                rotateCounterClockwise()
                rotateClockwise()
                rotateClockwise()
                wait(29)
                rotateCounterClockwise()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                rotateCounterClockwise()
                back()
                forward()
                drop()
                rotateClockwise()
                grab()
                pivotCounterClockwise()
                back()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                back()
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                grab()
                back()
                back()
                drop()
                forward()
                forward()
                grab()
                back()
                drop()
                rotateClockwise()
                forward()
                grab()
                back()
                back()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                drop()
                forward()
                forward()
                grab()
                rotateCounterClockwise()
                back()
                forward()
                drop()
                rotateClockwise()
                grab()
                pivotCounterClockwise()
                back()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                back()
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                drop()
                rotateClockwise()
                grab()
                forward()
                back()
                pivotClockwise()
                pivotClockwise()
                drop()
                forward()
                forward()
                grab()
                rotateCounterClockwise()
                back()
                forward()
                drop()
                rotateClockwise()
                grab()
                pivotCounterClockwise()
                back()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                drop()
                back()
                grab()
                pivotCounterClockwise()
                pivotCounterClockwise()
                pivotClockwise()
                pivotClockwise()
                pivotClockwise()
                drop()
                rotateClockwise()
                grab()
                forward()
                back()
                drop()
                forward()
                grab()
                back()
                reset()
            }
        }
        )
    }
}
