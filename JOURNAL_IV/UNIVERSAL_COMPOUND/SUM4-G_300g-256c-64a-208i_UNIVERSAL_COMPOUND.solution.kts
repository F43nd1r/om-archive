
solution {
    puzzle = "P072"
    name = "NEW SOLUTION 2"
    arm(ARM1) {
        number = 1
        position = -4 to 1
        rotation = 0
        size = 1
    }
    arm(ARM1) {
        number = 2
        position = -3 to 2
        rotation = -2
        size = 1
    }
    arm(ARM1) {
        number = 3
        position = -6 to 4
        rotation = 5
        size = 2
    }
    arm(ARM1) {
        number = 4
        position = -2 to 4
        rotation = 3
        size = 2
    }
    arm(ARM1) {
        number = 5
        position = -1 to -1
        rotation = 2
        size = 2
    }
    arm(ARM1) {
        number = 6
        position = -2 to 0
        rotation = 2
        size = 2
    }
    arm(VAN_BERLOS_WHEEL) {
        number = 7
        position = -6 to 2
        rotation = 2
        size = 1
    }
    glyph(MULTI_BONDER) {
        position = -2 to 2
        rotation = 0
    }
    glyph(DUPLICATION) {
        position = -5 to 2
        rotation = 0
    }
    glyph(ANIMISMUS) {
        position = -3 to 0
        rotation = -2
    }
    glyph(UNIFICATION) {
        position = -5 to 5
        rotation = -3
    }
    io(INPUT) {
        index = 0
        position = -3 to 1
        rotation = 0
    }
    io(OUTPUT) {
        index = 0
        position = 1 to 1
        rotation = 0
    }
    track {
        position = 0 to 0
        positions = listOf(-6 to 4, -5 to 3, -4 to 3, -3 to 2)
    }
    track {
        position = 0 to 0
        positions = listOf(-1 to 0, -2 to 0, -1 to -1, 0 to -1)
    }
    track {
        position = -5 to 7
        positions = listOf(2 to -1, 2 to -2, 3 to -3, 3 to -2)
    }
    tape {
        parallel(
        {
            sequence(1) {
                wait(4)
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                wait(3)
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                wait(3)
                grab()
                rotateCounterClockwise()
                wait(1)
                rotateClockwise()
                drop()
            }
        }
        , 
        {
            sequence(7) {
                wait(2)
                rotateClockwise()
                wait(3)
                rotateClockwise()
                rotateClockwise()
                wait(2)
                rotateClockwise()
                wait(1)
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                wait(1)
                rotateClockwise()
                wait(5)
                rotateClockwise()
                wait(5)
                rotateClockwise()
                rotateClockwise()
                wait(3)
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
            }
        }
        , 
        {
            sequence(3) {
                wait(6)
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                wait(6)
                forward()
                wait(3)
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                back()
                wait(2)
                grab()
                rotateCounterClockwise()
                wait(2)
                forward()
                forward()
                drop()
                rotateClockwise()
                back()
                back()
            }
        }
        , 
        {
            sequence(2) {
                grab()
                rotateClockwise()
                rotateClockwise()
                back()
                drop()
                back()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                wait(3)
                grab()
                rotateCounterClockwise()
                forward()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                wait(5)
                forward()
                wait(1)
                grab()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                extendTape()
            }
        }
        , 
        {
            sequence(4) {
                wait(9)
                grab()
                forward()
                rotateCounterClockwise()
                rotateClockwise()
                forward()
                drop()
                forward()
                wait(1)
                grab()
                rotateCounterClockwise()
                forward()
                forward()
                pivotCounterClockwise()
                back()
                forward()
                wait(2)
                pivotCounterClockwise()
                pivotClockwise()
                rotateCounterClockwise()
                back()
                pivotClockwise()
                pivotCounterClockwise()
                drop()
                back()
                back()
                wait(4)
                grab()
                back()
                wait(2)
                pivotCounterClockwise()
                back()
                drop()
                rotateClockwise()
                rotateClockwise()
            }
        }
        , 
        {
            sequence(5) {
                wait(2)
                grab()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                grab()
                forward()
                wait(1)
                rotateCounterClockwise()
                forward()
                drop()
                back()
                grab()
                forward()
                drop()
                back()
                back()
                rotateClockwise()
                grab()
                forward()
                drop()
                wait(1)
                back()
                grab()
                forward()
                drop()
                back()
                grab()
                back()
                rotateClockwise()
                drop()
                back()
                grab()
                back()
                pivotCounterClockwise()
                pivotCounterClockwise()
                forward()
                drop()
                back()
                rotateCounterClockwise()
                wait(1)
                back()
            }
        }
        , 
        {
            sequence(6) {
                wait(9)
                forward()
                grab()
                back()
                drop()
                wait(1)
                grab()
                wait(1)
                back()
                back()
                drop()
                forward()
                forward()
                forward()
                grab()
                back()
                rotateClockwise()
                drop()
                rotateCounterClockwise()
                back()
                back()
                back()
                grab()
                rotateClockwise()
                back()
                drop()
                rotateCounterClockwise()
                forward()
                grab()
                forward()
                drop()
                back()
                grab()
                rotateClockwise()
                back()
                drop()
                rotateCounterClockwise()
            }
        }
        )
    }
}
