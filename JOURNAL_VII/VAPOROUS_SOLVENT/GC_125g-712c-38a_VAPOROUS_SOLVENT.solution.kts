
solution {
    puzzle = "P098"
    name = "B GA"
    arm(VAN_BERLOS_WHEEL) {
        number = 1
        position = -1 to -1
        rotation = 5
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = 3 to -4
        rotation = 1
        size = 2
    }
    glyph(BONDER) {
        position = 2 to -1
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 1 to 0
        rotation = 6
    }
    glyph(DUPLICATION) {
        position = 0 to -1
        rotation = 6
    }
    glyph(PURIFICATION) {
        position = 1 to -3
        rotation = -6
    }
    glyph(EQUILIBRIUM) {
        position = 2 to -4
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 3 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 2 to 1
        rotation = 0
    }
    glyph(EQUILIBRIUM) {
        position = 5 to -3
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = 3 to -2
        rotation = 9
    }
    io(OUTPUT) {
        index = 0
        position = 5 to -1
        rotation = 4
    }
    io(INPUT) {
        index = 1
        position = 1 to -4
        rotation = 0
    }
    track {
        position = 2 to -3
        positions = listOf(2 to 0, 1 to 0, 1 to -1)
    }
    tape {
        parallel(
        {
            sequence(1) {
                wait(49)
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                wait(64)
                reset()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                rotateCounterClockwise()
                back()
                rotateClockwise()
                back()
                pivotClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                forward()
                forward()
                grab()
                pivotCounterClockwise()
                back()
                drop()
                back()
                rotateCounterClockwise()
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
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                forward()
                drop()
                rotateClockwise()
                forward()
                grab()
                pivotCounterClockwise()
                back()
                drop()
                back()
                rotateCounterClockwise()
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
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                back()
                grab()
                forward()
                drop()
                rotateClockwise()
                forward()
                grab()
                pivotCounterClockwise()
                back()
                drop()
                back()
                rotateCounterClockwise()
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
