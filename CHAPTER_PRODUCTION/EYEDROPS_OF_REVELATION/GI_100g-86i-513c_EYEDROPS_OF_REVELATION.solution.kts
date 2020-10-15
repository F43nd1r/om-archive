
solution {
    puzzle = "P081"
    name = "B GCX"
    arm(PISTON) {
        number = 1
        position = 3 to 3
        rotation = 3
        size = 2
    }
    glyph(BONDER) {
        position = 2 to 4
        rotation = 0
    }
    glyph(UNBONDER) {
        position = 1 to 5
        rotation = 0
    }
    glyph(CALCIFICATION) {
        position = 5 to 1
        rotation = 0
    }
    glyph(ANIMISMUS) {
        position = 3 to 2
        rotation = 10
    }
    io(INPUT) {
        index = 0
        position = 1 to 3
        rotation = 7
    }
    io(OUTPUT) {
        index = 0
        position = 5 to 2
        rotation = 1
    }
    io(OUTPUT) {
        index = 1
        position = 4 to 4
        rotation = 3
    }
    track {
        position = 2 to 3
        positions = listOf(0 to 0, 1 to 0)
    }
    conduit {
        id = 100
        position = -1 to 5
        rotation = 0
    }
    conduit {
        id = 100
        position = 4 to 5
        rotation = 0
    }
    conduit {
        id = 101
        position = 6 to 2
        rotation = 0
    }
    conduit {
        id = 101
        position = 8 to 1
        rotation = 0
    }
    tape {
        parallel(
        {
            sequence(1) {
                grab()
                rotateClockwise()
                retract()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                back()
                extend()
                grab()
                forward()
                rotateClockwise()
                rotateClockwise()
                rotateClockwise()
                drop()
                retract()
                back()
                grab()
                rotateCounterClockwise()
                rotateCounterClockwise()
                rotateCounterClockwise()
                forward()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                extend()
                grab()
                rotateClockwise()
                retract()
                rotateClockwise()
                extend()
                pivotClockwise()
                drop()
                back()
                grab()
                retract()
                forward()
                pivotClockwise()
                extend()
                pivotClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                retract()
                rotateClockwise()
                extend()
                drop()
                back()
                rotateClockwise()
                rotateClockwise()
                grab()
                retract()
                rotateCounterClockwise()
                rotateCounterClockwise()
                drop()
                extend()
                grab()
                forward()
                retract()
                extend()
                pivotCounterClockwise()
                drop()
                rotateCounterClockwise()
                rotateCounterClockwise()
                grab()
                rotateClockwise()
                retract()
                rotateClockwise()
                extend()
                pivotClockwise()
                drop()
                back()
                grab()
                retract()
                rotateClockwise()
                forward()
                pivotClockwise()
                extend()
                reset()
            }
        }
        )
    }
}
