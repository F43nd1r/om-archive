
solution {
    puzzle = "P072"
    name = "NEW SOLUTION 3"
    arm(ARM1) {
        number = 1
        position = -12 to -6
        rotation = 3
        size = 1
    }
    arm(VAN_BERLOS_WHEEL) {
        number = 2
        position = -15 to -6
        rotation = 1
        size = 1
    }
    glyph(BONDER) {
        position = -11 to -5
        rotation = 3
    }
    glyph(DUPLICATION) {
        position = -14 to -6
        rotation = 0
    }
    glyph(ANIMISMUS) {
        position = -13 to -6
        rotation = 0
    }
    glyph(UNIFICATION) {
        position = -12 to -6
        rotation = 0
    }
    io(INPUT) {
        index = 0
        position = -13 to -6
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = -10 to -5
        rotation = 1
    }
    track {
        position = -12 to -6
        positions = listOf(0 to 0, 1 to 0)
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                rotateClockwise()
                reset()
                wait(2)
                grab()
                rotateClockwise()
                reset()
                wait(1)
                grab()
                rotateCounterClockwise()
                reset()
                wait(1)
                grab()
                forward()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateClockwise()
                rotateClockwise()
                reset()
                wait(3)
                grab()
                rotateClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                forward()
                reset()
                wait(3)
                grab()
                rotateClockwise()
                rotateClockwise()
                forward()
                pivotCounterClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                reset()
                wait(4)
                grab()
                rotateClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                forward()
                reset()
                wait(3)
                grab()
                rotateClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                forward()
                reset()
                wait(3)
                grab()
                forward()
                drop()
                back()
                rotateClockwise()
                grab()
                forward()
                rotateClockwise()
                reset()
                wait(3)
                grab()
                rotateClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                forward()
                reset()
                wait(3)
                grab()
                rotateClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                forward()
                rotateClockwise()
                reset()
                wait(3)
                grab()
                rotateClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                forward()
                drop()
                rotateClockwise()
                rotateClockwise()
                back()
                grab()
                forward()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                reset()
                wait(3)
                grab()
                rotateClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                forward()
                reset()
                wait(3)
                grab()
                rotateClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                pivotCounterClockwise()
                rotateClockwise()
                pivotCounterClockwise()
                forward()
                rotateClockwise()
                reset()
                wait(3)
                grab()
                rotateClockwise()
                rotateClockwise()
                reset()
            }
        }
        , 
        {
            sequence(2) {
                wait(1)
                rotateCounterClockwise()
                wait(5)
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(2)
                rotateCounterClockwise()
                wait(5)
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(10)
                rotateCounterClockwise()
                wait(19)
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(7)
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(95)
                rotateCounterClockwise()
            }
        }
        )
    }
}
